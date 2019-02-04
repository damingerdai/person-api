package org.daming.person.utils;

import org.daming.person.pojo.User;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Md5SaltToolTest {

    private Map<String, String> map = new HashMap<>();

    @Test
    public void test() {
        String userName = "zyg";
        String password = "123";
        registerUser(userName,password);

        userName = "changong";
        password = "456";
        registerUser(userName,password);

        String loginUserId = "zyg";
        String pwd = "1232";
        try {
            if(loginValid(loginUserId,pwd)){
                System.out.println("欢迎登陆！！！");
            }else{
                System.out.println("口令错误，请重新输入！！！");
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void registerUser(String userName,String password) {
        String encryptedPwd = null;
        try {
            encryptedPwd = Md5SaltTool.getEncryptedPwd(password);
            map.put(userName, encryptedPwd);

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean loginValid(String userName,String password)
            throws NoSuchAlgorithmException, UnsupportedEncodingException{
             /*String loginUserId = "zyg";
               String pwd = "1232";*/
        String pwdInDb =  map.get(userName);
        if(null!=pwdInDb){ // 该用户存在
            return Md5SaltTool.validPassword(password, pwdInDb);
        }else{
            System.out.println("不存在该用户！！！");
            return false;
        }
    }



}