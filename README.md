# idea spring boot 整合 Mybatis 注意事项

1：注入dao层时，private UserDao userDao; 
报错Could not autowire. No beans of 'UserMapper' type found
 解决方案一：
 @Autowired 注解换成 @Resource 注解，这两个注解实现的功能是一样的，只是来源于不同的包而已:
 @Autowired来源于Spring的包，
 @Resource来源于java自带的包.
 
# moredate 多数据源
spring.datasource.one.url=jdbc:mysql://localhost:3306/z2019?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true
spring.datasource.one.username=root
spring.datasource.one.password=root
spring.datasource.one.type=com.alibaba.druid.pool.DruidDataSource

spring.datasource.two.url=jdbc:mysql://localhost:3306/z2019?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true
spring.datasource.two.username=root
spring.datasource.two.password=root
spring.datasource.two.type=com.alibaba.druid.pool.DruidDataSource
然后再提供两个DataSource，如下：
@Configuration
public class DataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.one")
    DataSource dsOne() {
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.two")
    DataSource dsTwo() {
        return DruidDataSourceBuilder.create().build();
    }
}

