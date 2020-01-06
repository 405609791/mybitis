package org.codefarmer.mybatismoredate.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * 接下来则是MyBatis的配置，不同于JdbcTemplate，MyBatis的配置要稍微麻烦一些，
 * 因为要提供两个Bean，因此这里两个数据源我将在两个类中分开来配置，首先来看第一个数据源的配置：
 */
@Configuration
@MapperScan(basePackages = "org.codefarmer.mybatismoredate.dao1",sqlSessionFactoryRef = "sqlSessionFactory1",sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatisConfigOne {
    @Autowired
    @Qualifier("dsOne")
    DataSource dsOne;

    @Bean
    SqlSessionFactory sqlSessionFactory1() {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dsOne);
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplate1() {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
