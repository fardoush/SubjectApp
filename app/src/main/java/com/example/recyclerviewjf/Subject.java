package com.example.recyclerviewjf;

public class Subject {
    private  int image;
    private String name;
    public Subject(int image,String name){
        //Alter+insert
        this.image=image;

        this.name=name;

    }
    public int getImage(){
        return image;
    }
    public String getName(){
        return name;
    }
}
