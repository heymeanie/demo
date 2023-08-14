package com.example.demo.progress;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class ProgressService implements ProgressInterface {

    private final ProgressRepository repo;

    @Override
    public List<Progress> findAll() {
        return repo.findAll();
    }

    @Override
    public Progress findById(Long id) {

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
    public Progress save(Progress progress) {
        return repo.save(progress);
    }

}