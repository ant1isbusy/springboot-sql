package com.antoine.footy.player;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayerService {
    public static List<Player> getPlayers() {
        return List.of(new Player(1L, "Antonio", "Arsenal", 5L));
    }
}
