package com.antoine.footy.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private Long id;
    private String team_name;
    private Long team_id;


    public Player(Long id, String name, String team_name, Long team_id) {
        this.id = id;
        this.name = name;
        this.team_name = team_name;
        this.team_id = team_id;
    }
}
