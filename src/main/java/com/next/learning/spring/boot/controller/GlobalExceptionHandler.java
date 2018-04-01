package com.next.learning.spring.boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nextbin
 * @since 2018-04-01.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, Object> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", e.getMessage());
        map.put("e", e.getClass().getSimpleName());
        return map;
    }
}
