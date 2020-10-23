package com.hujf.project.dto;

import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hujf
 * @title: SmUserDetails
 * @date 2020/10/12 0012下午 2:34
 * @description: TODO
 */
public class SmUserDetails implements UserDetails {

    private SmUser smUser;
    private List<SmResource> resourceList;
    public SmUserDetails(SmUser smUser,List<SmResource> resourceList){
        this.smUser = smUser;
        this.resourceList = resourceList;
     }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
        return resourceList.stream()
                .map(role ->new SimpleGrantedAuthority(role.getResourcePk()+":"+role.getResourceName()))
                .collect(Collectors.toList());
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
