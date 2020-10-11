package com.lsmri.welding.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 *
 * @author Cui Yicheng
 * @since 2020/10/9
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.lsmri.welding.mapper", "com.lsmri.welding.auth.dao"})
public class MybatisConfig {
}
