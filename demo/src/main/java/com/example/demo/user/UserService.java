package com.example.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class UserService implements UserInterface {

    private final UserRepository repo;

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User findById(Long id) {

        if (id.equals(1L)) {
            return null;
        }

        return repo.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repo.deleteById(id);
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

}