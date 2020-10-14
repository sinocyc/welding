package com.lsmri.welding.test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author Cui Yicheng
 * @date 2020-10-14
 */
public class BigDecimalTest {

    @Test
    public void test01() {
        BigDecimal a = new BigDecimal(0.3);
        System.out.println(a.doubleValue());
    }

}
