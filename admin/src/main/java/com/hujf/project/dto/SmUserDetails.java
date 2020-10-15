package com.hujf.project.dto;

import com.hujf.project.model.SmUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author Hujf
 * @title: SmUserDetails
 * @date 2020/10/12 0012下午 2:34
 * @description: TODO
 */
public class SmUserDetails implements UserDetails {

    private SmUser smUser;
    public SmUserDetails(SmUser smUser){
        this.smUser = smUser;
     }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return smUser.getUserPassword();
    }

    @Override
    public String getUsername() {
        return smUser.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
