package com.learnProgramming;

public class furniture {

    private String name;
    private String model;
    private String quality;

    public furniture(String name, String model, String quality){
        this.name = name;
        this.model = model;
        this.quality = quality;
    }

    public void typeOFfurniture(){
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Quality: " + this.quality);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getQuality() {
        return quality;
    }
}
