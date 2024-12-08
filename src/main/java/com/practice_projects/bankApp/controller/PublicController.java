package com.practice_projects.bankApp.controller;

import com.practice_projects.bankApp.dto.UserRegistrationDTO;
import com.practice_projects.bankApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @PostMapping("register-user")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDTO newUser){
        try{
            return new ResponseEntity<>(userService.saveUser(newUser), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
