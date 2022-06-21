package com.example.demo.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {


    @RequestMapping("/test")
    public Map<Object, Object> test(@RequestParam String name) throws Exception {

        Map<Object, Object> map = new HashMap<>();
        try {
            map.put("code","200");
            map.put("msg","成功");
            if ("小明".equals(name)) {
                map.put("data",name);
                return map;
            }

        } catch (Exception e) {
            throw new Exception(e.toString());
        }
        map.put("data","not find");
        return map;

    }
}
