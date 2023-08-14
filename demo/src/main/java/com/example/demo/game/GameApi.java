package com.example.demo.game;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.common.CommonConstants.API_ID;
import static com.example.demo.common.CommonConstants.API_GAMES;

@RequestMapping(API_GAMES)
public interface GameApi {

    @GetMapping
    List<Game> findAll();

    @GetMapping(API_ID)
    Game findById(@PathVariable Long id);

    @PostMapping
    Game save(@RequestBody Game game);

    @DeleteMapping(API_ID)
    String remove(@PathVariable Long id);

}