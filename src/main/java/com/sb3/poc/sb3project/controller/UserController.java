package com.sb3.poc.sb3project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bhardwaj, Abhishek
 * @project sb3-project
 * @date 16/11/22
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public ResponseEntity<List<String>> getUser() {
        return ResponseEntity.of(java.util.Optional.of(Arrays.asList("abhishek", "neha")));
    }
}
