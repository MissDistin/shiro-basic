package com.example.shiro.core.config.shiro;

import cn.licoy.encryptbody.util.MD5EncryptUtil;
import com.example.shiro.common.util.JwtUtil;
import com.example.shiro.core.config.jwt.JwtToken;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 11:47
 * @Description: 身份信息匹配器
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        JwtToken jwtToken = (JwtToken) token;
        Object accountCredentials = getCredentials(info);
        if(jwtToken.getPassword()!=null){
            Object tokenCredentials = MD5EncryptUtil.encrypt(String.valueOf(
                    jwtToken.getPassword())+jwtToken.getUsername());
            if(!accountCredentials.equals(tokenCredentials)){
                throw new DisabledAccountException("密码不正确！");
            }
        }else{
            boolean verify = JwtUtil.verify(jwtToken.getToken(), jwtToken.getUsername(), accountCredentials.toString());
            if(!verify){
                throw new DisabledAccountException("verifyFail");
            }
        }
        return true;
    }
}
