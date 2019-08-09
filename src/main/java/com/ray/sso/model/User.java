package com.ray.sso.model;

import lombok.Data;

/**
 * 用户模型
 *
 * @author Ray.Ma
 * @date 2019/8/9 10:24
 */
@Data
public class User {
    private Long id;

    private String username;

    private String password;
}
