package com.oscar.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")

public class UserRestController {

    @GetMapping(path="/details")
    public Map<String, Object> details() {

        User user = new User("Oscar", "Contreras");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot");
        body.put("User", user);
        
        return body;
    }
     

}
