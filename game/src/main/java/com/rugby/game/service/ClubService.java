package com.rugby.game.service;

import com.rugby.game.model.Club;
import com.rugby.game.model.Player;
import com.rugby.game.model.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {

    private final List<Club>clubs = new ArrayList<>();

    public ClubService() {
        createTestData();
    }

    private void createTestData() {

        Club barcelona = new Club(1L, "England Rugby");

        Player player = new Player(
                1L,
                "Fin Smith",
                Position.FLY_HALF
        );

        player.setSpeed(75);
        player.setPassing(85);
        player.setKicking(90);
        player.setTackling(65);
        player.setStrength(60);

        barcelona.addPlayer(player);

        clubs.add(barcelona);
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public Club getClub(Long id) {
        return clubs.stream()
                .filter(club -> club.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
