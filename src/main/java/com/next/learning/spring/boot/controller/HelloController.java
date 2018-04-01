package com.next.learning.spring.boot.controller;

import com.next.learning.spring.boot.entity.DemoConfiguration;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nextbin
 * @since 2018-04-01.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DemoConfiguration configuration;

    @ApiOperation(value = "hello", notes = "hello")
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello() {
        return "Hello U";
    }

    @ApiOperation(value = "测试", notes = "测试")
    @RequestMapping(value = "/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("project", configuration.getProject());
        map.put("fileTmpDir", configuration.getFileTmpDir());
        map.put("refUrls", configuration.getRefUrls());
        return map;
    }

    @ApiOperation(value = "加法", notes = "将两数相加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", value = "数a", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "b", value = "数b", required = true, dataType = "Long", paramType = "query")
    })
    @RequestMapping(value = "/plus", method = RequestMethod.GET)
    public Map<String, Object> plusGet(@RequestParam Long a, @RequestParam Long b) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", a + b);
        return map;
    }

    @ApiOperation(value = "加法POST", notes = "将两数相加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", value = "数a", required = true, dataType = "Long", paramType = "form"),
            @ApiImplicitParam(name = "b", value = "数b", required = true, dataType = "Long", paramType = "form"),
    })
    @RequestMapping(value = "/plus", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    public Map<String, Object> plusPost(@RequestParam Long a, @RequestParam Long b) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", a + b);
        return map;
    }

}
