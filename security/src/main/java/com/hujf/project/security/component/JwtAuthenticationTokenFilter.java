package com.hujf.project.security.component;

import com.hujf.project.common.exception.ApiException;
import com.hujf.project.common.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;


    @Override
    public void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
          String authHeader = httpServletRequest.getHeader(this.tokenHeader);
//        if(authHeader != null){
//            String username = jwtTokenUtil.getUserNameFromToken(authHeader);
//            LOGGER.info("checking username:{}", username);
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//                if (jwtTokenUtil.validateToken(authHeader, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//                    SecurityContextHolderSecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//            }
//
//        }
        SecurityContextHolder.getContext().setAuthentication(getAuthentication(authHeader));
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        return ;
    }

    private Authentication getAuthentication(String authHeader) {
        String username = jwtTokenUtil.getUserNameFromToken(authHeader);
//        String role = jwtTokenUtil.getUserRole(token);
        if(username==null){
            throw new ApiException("token认证失败");
        }
        return new UsernamePasswordAuthenticationToken(username, null,
                null);

    }
}
