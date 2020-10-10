package com.lsmri.welding.test;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.sql.Statement;

/**
 * @author Cui Yicheng
 * @date 2020-09-24
 */
@Component
@Intercepts({@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})
public class InterceptorTest implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object returnObject = invocation.proceed();
        return returnObject;
    }

}
