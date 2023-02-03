package com.example.demo;


import com.example.demo.Model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
   @GetMapping()
    public User getUser() {
        User user = new User("1", 1);


        return user;
    }
}
