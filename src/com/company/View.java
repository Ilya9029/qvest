package com.company;

import java.util.Scanner;

public class View {
    int showLocation(Location location){
        Scanner in = new Scanner(System.in);
        System.out.println(location.getText());
        Action[] actions = location.getActions();
        for (int i = 0; i < actions.length; ++i){
            System.out.println(i + 1 + ") "+ actions[i].getText());
        }
        int ans = in.nextInt();
        return ans - 1;
    }
}
