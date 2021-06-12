package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/users")
    public ResponseEntity getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body("users");
    }

}
