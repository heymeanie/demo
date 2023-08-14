package com.example.demo.game;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class GameController implements GameApi {

    private final GameInterface gameInterface;

    @Override
    public List<Game> findAll() {
        return gameInterface.findAll();
    }

    @Override
    public Game findById(@PathVariable Long id) {
        return gameInterface.findById(id);
    }

    @Override
    public Game save(@RequestBody Game game) {
        return gameInterface.save(game);
    }

    @Override
    public String remove(@PathVariable Long id) {
        try {
            gameInterface.remove(id);
            return "Game deleted successfully";
        } catch (Exception e) {
            return "Game not found";
        }
    }

}