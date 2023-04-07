package com.httpmethods.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin
public class userController {
    @GetMapping("/getUser")
    public String getuser(){
    return "Get Method";
    }
@PostMapping("/setUser")
public String setuser(){
return "Add method";
}
@PutMapping("/putUser")
public String putuser(){
    return "Put Method";
}

@DeleteMapping("/deleteUser")
public String deleteuser(){
    return "Delete Method";
}


    
}
