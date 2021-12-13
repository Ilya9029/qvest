package com.company;

public class Game {
    private Storage storage;
    private View view;
    private Location currentLocation;

    public Game(Storage storage, View view) {
        this.storage = storage;
        this.view = view;
    }
    void start() {
        int idLoc = 0;
        do {
            currentLocation = storage.getLocation(idLoc);
            int ans = view.showLocation(currentLocation);
            idLoc = currentLocation.getActions()[ans].getDestLocationId();
        } while (idLoc != -1);
    }
    void userChoice(int actionIndex) {
        int idLoc = currentLocation.getActions()[actionIndex].getDestLocationId();
        if (idLoc != -1) {
            currentLocation = storage.getLocation(idLoc);
            view.showLocation(currentLocation);
        }
    }
}
