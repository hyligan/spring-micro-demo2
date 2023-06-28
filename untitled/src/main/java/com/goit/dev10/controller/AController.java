package com.goit.dev10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/teste")
    public String testEclient() {
        return restTemplate.getForObject("http://eclient/test", String.class);
    }

    @GetMapping("/test")
    public String test() {
        return "aclient say hello";
    }
}
