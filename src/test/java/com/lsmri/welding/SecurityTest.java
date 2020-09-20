package com.lsmri.welding;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Cui Yicheng
 * @date 2020-09-13
 */
public class SecurityTest {

    @Test
    void test01() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pd = encoder.encode("123456");
        System.out.println("==========");
        System.out.println(pd);
        System.out.println(pd.length());
        System.out.println(encoder.matches("123456", pd));
    }

}
