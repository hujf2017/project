package com.hujf.project.component;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;

/**
 * @author DELL
 */
@Aspect
@Component
@Slf4j
@Order(1)
public class LogAspect {



    /**
     * ..表示包及子包 该方法代表controller层的所有方法  TODO 路径需要根据自己项目定义
     */
    @Pointcut("execution(public * com.hujf.project.controller.*.*(..))")
    public void controllerMethod() {
    }


    @Around(value = "controllerMethod()")
    public Object aroundController(ProceedingJoinPoint joinPoint) throws Throwable {
        // 目标类的名称
        String className = joinPoint.getTarget().getClass().getName();
        // 方法名称
        String methodName = joinPoint.getSignature().getName();
        // 参数列表
        Parameter[] parameters = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameters();
        Object[] args = joinPoint.getArgs();

        StringBuilder params = new StringBuilder("[");
        for (int i = 0; i < parameters.length; i++) {
            params.append(parameters[i].getName()).append(":").append(args[i]).append("; ");
        }
        if (parameters.length > 0) {
            int length = params.length();
            params.delete(length - 2, length);
        }
        params.append("]");

        Object result = null;
        long start = 0L;
        long end = 0L;
        try {

            start = System.currentTimeMillis();
            // 执行方法
            result = joinPoint.proceed();
            end = System.currentTimeMillis();
        } catch (Exception e) {
            // 记录异常日志
            log.error(">>>> Target class name={} | method name={}\n{}\n\t at {} <<<<", className, methodName, e.toString(), e.getStackTrace()[0]);
            throw e;
        }
        // 记录方法结果
        log.info(">>>> Target class name={} | method name={} | params={} | 执行时间={} <<<<", className, methodName, params,
                (end - start) + "ms");
        return result;

    }




}
