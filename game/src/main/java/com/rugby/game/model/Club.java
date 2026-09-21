package com.rugby.game.model;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private Long id;
    private String name;
    private List<Player> squad = new ArrayList<>();

    public Club(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getSquad() {
        return squad;
    }

    public void addPlayer(Player player) {
        squad.add(player);
    }
}
