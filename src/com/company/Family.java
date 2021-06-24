package com.company;

public class Family {
    public String name;
    public int numberOfChildren;
    public boolean celebrateChristmas;

    public void intro(){
        System.out.println(String.format("The family of %s has %s child(ren)",name,numberOfChildren));
    }
}
