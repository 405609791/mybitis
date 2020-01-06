package org.codefarmer.mybatismoredate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"org.codefarmer.mybatismoredate.dao1","org.codefarmer.mybatismoredate.dao2"})
public class MybatismoredateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatismoredateApplication.class, args);
    }

}
