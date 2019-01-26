package org.daming.person.utils;

import org.junit.Test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.jsonwebtoken.ExpiredJwtException;

import static org.junit.Assert.*;

public class JwtUtilTest {

    @Test(expected = ExpiredJwtException.class)
    public void test() {
        var k = "daming";
        var key = JwtUtil.generalKey(k);
        var id =  "daming";
        var subject = "damingerdai";
        var ttlMillis = 60 * 1000L;
        var map = new HashMap<String, Object>(4);
        map.put("username", "daming");
        var token = JwtUtil.createJWT(id, subject, ttlMillis, key, map);
        System.out.println("token: " + token);
        var claims = JwtUtil.parseJwt(token, key);
        System.out.println(claims.getIssuedAt());
        assertEquals(claims.getId(), id);
        assertEquals(claims.getSubject(), subject);
        assertEquals(claims.get("username"), "daming");
        try {
            TimeUnit.SECONDS.sleep(65L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JwtUtil.parseJwt(token, key);
    }

    @Test
    public void createJWT() {
        System.out.println("createJWT 没有测试");
    }

    @Test
    public void parseJwt() {
        System.out.println("parseJwt 没有测试");
    }

    @Test
    public void generalKey() {
        System.out.println("generalKey 没有测试");
    }
}