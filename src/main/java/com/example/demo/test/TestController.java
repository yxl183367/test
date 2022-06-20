package com.example.demo.test;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(@RequestParam String name) throws Exception {

        try {
            if ("小明".equals(name)) {
                return name;
            }
            String s = null;
            if(s.equals("aaa")){
                System.out.println("111111111111");
            }

        } catch (Exception e) {
            throw new Exception(e.toString());
        }
        return "Hello word!!!";

    }
}
