package com.learnProgramming;

public class house {

    private single_room theSingle_Room;
    private furniture furniture;

    public house(single_room theSingle_Room, furniture furniture){
        this.theSingle_Room = theSingle_Room;
        this.furniture = furniture;
    }

    public void OpenWindow(){
        theSingle_Room.OpenWindow(theSingle_Room.isWindow());
    }

    public void Typefurniture(){

        furniture.typeOFfurniture();

    }
}
