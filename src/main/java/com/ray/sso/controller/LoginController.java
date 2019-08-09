package com.ray.sso.controller;

import com.ray.sso.security.JwtAuthenticatioToken;
import com.ray.sso.utils.SecurityUtils;
import com.ray.sso.vo.HttpResult;
import com.ray.sso.vo.LoginBean;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录控制器
 *
 * @author Ray.Ma
 * @date 2019/8/9 9:47
 */
@RestController
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    @SneakyThrows
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        // 系统登录认证
        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);

        return HttpResult.ok(token);
    }

}
