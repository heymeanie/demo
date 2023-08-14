package com.example.demo.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.common.CommonConstants.API_ID;
import static com.example.demo.common.CommonConstants.API_USERS;

@RequestMapping(API_USERS)
public interface UserApi {

    @GetMapping
    List<User> findAll();

    @GetMapping(API_ID)
    User findById(@PathVariable Long id);

    @PostMapping
    User save(@RequestBody User user);

    @DeleteMapping(API_ID)
    String remove(@PathVariable Long id);

}