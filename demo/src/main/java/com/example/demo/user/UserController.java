package com.example.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserInterface userInterface;

    @Override
    public List<User> findAll() {
        return userInterface.findAll();
    }

    @Override
    public User findById(@PathVariable Long id) {
        return userInterface.findById(id);
    }

    @Override
    public User save(@RequestBody User user) {
        return userInterface.save(user);
    }

    @Override
    public String remove(@PathVariable Long id) {
        try {
            userInterface.remove(id);
            return "User deleted successfully";
        } catch (Exception e) {
            return "User not found";
        }
    }

}