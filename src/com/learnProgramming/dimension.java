package com.learnProgramming;

public class dimension {

    private double height;
    private double weight;

    public dimension(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public void Walldimension(){
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
