package org.lotr.controllers;

import org.lotr.initializers.GameInitializer;
import org.lotr.team.Team;
import org.lotr.world.BasicWorld;

public class GameController {
    private BasicWorld world;
    private Team team;

    public void newGame() {
        world = GameInitializer.initializeWorld();
        team = GameInitializer.initializeTeam(world.getRegions().get(0).getCities().get(0)); // Hobbiton jako startowe miasto

    }

    public BasicWorld getWorld() {
        return world;
    }

    public Team getTeam() {
        return team;
    }
}
