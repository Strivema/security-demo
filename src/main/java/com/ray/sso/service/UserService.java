package com.ray.sso.service;

import com.ray.sso.model.User;

import java.util.Set;

/**
 * @author Ray.Ma
 * @date 2019/8/9 10:25
 */
public interface UserService {
    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     * 查找用户的菜单权限标识集合
     *
     * @param userName
     * @return
     */
    Set<String> findPermissions(String username);
}
