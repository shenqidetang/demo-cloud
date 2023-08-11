package com.tang.demo.auth.security.details.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @description: 系统管理用户认证信息
 * @author: tzq
 * @time: 2023/6/8 22:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserDetails implements UserDetails {

    /**
     * 扩展字段
     */
    private Long userId;

    /**
     * 默认字段
     */
    private String username;
    private String password;
    private Boolean enabled;
    /**
     * 角色
     */
    private Collection<SimpleGrantedAuthority> authorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}