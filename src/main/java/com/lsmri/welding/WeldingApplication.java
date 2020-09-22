package com.lsmri.welding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@SpringBootApplication
@MapperScan("com.lsmri.welding.mapper")
public class WeldingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeldingApplication.class, args);
    }

}
