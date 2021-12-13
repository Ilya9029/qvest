package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        View view  = new View();
        view.showLocation(storage.getLocation(2));
        Game game = new Game(storage, view);
        game.start();
    }
}
