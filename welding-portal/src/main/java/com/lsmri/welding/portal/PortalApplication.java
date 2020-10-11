package com.lsmri.welding.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Cui Yicheng
 * @date 2020-10-11
 */
@SpringBootApplication(scanBasePackages = "com.lsmri.welding")
public class PortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

}
