package com.microservices.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method inside user Controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserById(@PathVariable("id") Long userId){
        log.info("Inside findUserById method inside user Controller");
        return userService.findUserById(userId);
    }

}
