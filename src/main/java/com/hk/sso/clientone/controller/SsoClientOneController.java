package com.hk.sso.clientone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appone")
public class SsoClientOneController {
	@RequestMapping("/home")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
