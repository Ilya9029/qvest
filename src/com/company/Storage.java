package com.company;

public class Storage {
    private Location[] locs = new Location[3];

    public Storage() {
        locs[0] = new Location(0, "Monster: Hello, my new visitor. I want to play a game with you. I'll bring it in a minute. DON'T MOVE!!!",
                new Action[]{ new Action("Try to escape and run away", 1),
                              new Action("Check a box which is next to you", 2)
        });
        locs[1] = new Location(1, "You are in the forest. What to do?",
                new Action[]{ new Action("Forward", 2),
                        new Action("Backward", 0)
                });

        locs[2] = new Location(2, "You are on the forest. What to do?",
                new Action[]{ new Action("Left", 1),
                        new Action("Right", 0)
                });
    }
    Location getLocation(int id){
       return locs[id];
    }
}
