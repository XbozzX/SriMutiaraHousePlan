package com.learnProgramming;

public class single_room {

    private dimension wall;
    private boolean marble;
    private boolean window;
    private furniture furniture;

    public single_room(dimension wall, boolean marble, boolean window, furniture furniture){
        this.wall = wall;
        this.marble = marble;
        this.window = window;
        this.furniture = furniture;
    }

    public void OpenWindow(boolean window){
        if (window != true){
            System.out.println("No window");
        } else {
            System.out.println("Open window");
        }
    }

    public dimension getWall() {
        return wall;
    }

    public boolean isMarble() {
        return marble;
    }

    public boolean isWindow() {
        return window;
    }

    public furniture getFurniture() {
        return furniture;
    }
}
