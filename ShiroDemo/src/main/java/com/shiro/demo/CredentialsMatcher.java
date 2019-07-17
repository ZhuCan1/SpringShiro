package com.shiro.demo;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;



public class CredentialsMatcher extends SimpleCredentialsMatcher {

    //重写密码校验规则
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        //获取用户输入的密码信息
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String password = new String(usernamePasswordToken.getPassword());
        //获取数据库中密码信息
        String dbPassword = (String) info.getCredentials();
        //比较二者是否相等
        return super.doCredentialsMatch(token, info);
    }
}
