package com.example.demo;

import com.amazonaws.services.dynamodbv2.model.Get;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;

import java.util.HashMap;
import java.util.Map;


/**
 * Handles requests for the application home page.
 */
@CrossOrigin(origins="*")
@RestController
public class RouterFunctionConfig {
/*

    @Bean
    public RouterFunction<?> index() {
        return route(Get("/hello"),
                request -> ok().body(just("Hello world!!"), String.class));
    }
*/
    @GetMapping("/test")
    public Map<?,?> hello(){
        System.out.println("React Boot connect Success");
        var map = new HashMap<String, String>();
        map.put("a","a");
        map.put("b","b");
        return map;
    }
}


