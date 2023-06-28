package com.fly.micro.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/test")
    public String test() {
        return "eclient say hello";
    }
    @GetMapping("/testa")
    public String testAclient() {
        return restTemplate.getForObject("http://aclient/test", String.class);
    }
}
