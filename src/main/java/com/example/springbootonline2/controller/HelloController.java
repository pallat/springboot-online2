package com.example.springbootonline2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public PostResponse sayHi(@RequestBody RequestPostBody request) {
        System.out.println(request.message);
        return new PostResponse(request.message);
    }
}
