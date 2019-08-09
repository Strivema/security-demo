package com.ray.sso.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Ray.Ma
 * @date 2019/8/9 10:50
 */
public class GrantedAuthorityImpl implements GrantedAuthority {
    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
