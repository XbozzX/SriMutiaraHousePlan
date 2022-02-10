package com.learnProgramming;

public class Main {

    public static void main(String[] args) {

        dimension dimension1 = new dimension(17.5,15.5);
        furniture furniture1 = new furniture("Gaming Chair", "Todak","Great");

        single_room single_room1 = new single_room(dimension1, true, true, furniture1);

        single_room1.getWall().Walldimension();
        single_room1.OpenWindow(false);
    }
}
