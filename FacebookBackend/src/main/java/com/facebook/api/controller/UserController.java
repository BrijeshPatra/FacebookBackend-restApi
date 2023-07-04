package com.facebook.api.controller;
import com.facebook.api.entity.Users;
import com.facebook.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/userService")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public Users saveUserMetaData(@RequestBody Users users){
        return userService.saveUserMetaData(users);
    }
    @GetMapping("/getUsers")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/getAllUsers/{userID}")
     public Optional<Users> getUserByID(@PathVariable ("userID") UUID userID){
        return userService.getUsersByID(userID);
    }
}
