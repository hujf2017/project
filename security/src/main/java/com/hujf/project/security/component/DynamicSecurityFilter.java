//package com.hujf.project.security.component;
//
//import cn.hutool.core.util.StrUtil;
//import com.hujf.project.common.util.JwtTokenUtil;
//import com.hujf.project.security.config.IgnoreUrlsConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Component;
//import org.springframework.util.AntPathMatcher;
//import org.springframework.util.PathMatcher;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * @author Hujf
// * @title: DynamicSecurityFilter
// * @date 2020/10/17 0017下午 2:21
// * @description: TODO
// */
//@WebFilter(filterName = "piceaFilter", urlPatterns = "/*")
//@Component
//public class DynamicSecurityFilter implements Filter {
//    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicSecurityFilter.class);
//
////    @Autowired
////    private UserService userService;
//
//    @Value("${jwt.tokenHeader}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;
//
//    @Autowired
//    private IgnoreUrlsConfig ignoreUrlsConfig;
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        String url = filterConfig.getInitParameter("URL");
//        System.out.println("我是过滤器的初始化方法！URL=" + url + "，生活开始.........");
//    }
//
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        // 获取端口号
//        int localPort = request.getLocalPort();
//        System.out.println(localPort + "-----------------------------------------------------------------------------");
//        //OPTIONS请求直接放行
//        if (request.getMethod().equals(HttpMethod.OPTIONS.toString())) {
//            filterChain.doFilter(servletRequest, servletResponse);
//            return;
//        }
//        //白名单请求直接放行
//        PathMatcher pathMatcher = new AntPathMatcher();
//        System.out.println("白名单：" + ignoreUrlsConfig.getUrls().toString());
//        System.out.println("请求的路径：" + request.getRequestURI() +
//                "==============================================================");
//        for (String path : ignoreUrlsConfig.getUrls()) {
//            if (pathMatcher.match(path, request.getRequestURI())) {
//                filterChain.doFilter(servletRequest, servletResponse);
//                return;
//            }
//        }
//
//        //获得header里的token
//        String authHeader = request.getHeader(this.tokenHeader);
//        System.out.println("authHeader:" + authHeader);
//        if (!StrUtil.isEmpty(authHeader)) {
//
//            String name = jwtTokenUtil.getUserNameFromToken(tokenHeader);
//            LOGGER.info("checking phoneAndTime:{}", name);
//        }
//    }
//}
