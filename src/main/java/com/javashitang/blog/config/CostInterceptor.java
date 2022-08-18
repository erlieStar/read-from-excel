package com.javashitang.blog.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lilimin
 * @since 2020-04-16
 */
@Slf4j
public class CostInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("request-starttime", System.currentTimeMillis());
        log.info("request enter: {}", request.getRequestURI());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long startTime = (Long) request.getAttribute("request-starttime");
        if (startTime != null) {
            long cost = System.currentTimeMillis() - startTime;
            log.info("request cost:[" + request.getRequestURI() + ", "
                    + request.getQueryString() + "] " + cost);
        }
    }
}
