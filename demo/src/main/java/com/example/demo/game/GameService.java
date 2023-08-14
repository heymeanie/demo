package com.example.demo.game;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class GameService implements GameInterface {

    private final GameRepository repo;

    @Override
    public List<Game> findAll() {
        return repo.findAll();
    }

    @Override
    public Game findById(Long id) {

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
    public Game save(Game game) {
        return repo.save(game);
    }

}