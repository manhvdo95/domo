package com.rysk.domo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("domo")
public class DomoController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Hello World");
    }

}
