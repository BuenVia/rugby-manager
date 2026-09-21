package com.rugby.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/api/game")
    public String gameController() {
        return "Rugby Game!";
    }

}
