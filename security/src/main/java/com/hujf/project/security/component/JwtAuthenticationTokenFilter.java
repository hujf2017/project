package com.hujf.project.security.component;

import com.hujf.project.common.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Hujf
 * @title: JwtAuthenticationTokenFilter
 * @date 2020/10/17 0017下午 4:59
 * @description: 获取token
 */
public class JwtAuthenticationTokenFilter  extends OncePerRequestFilter {


    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        if(authHeader != null){

        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
