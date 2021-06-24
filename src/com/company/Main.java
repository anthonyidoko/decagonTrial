package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Family tony = new Family();
        tony.numberOfChildren = 3;
        tony.celebrateChristmas = true;
        tony.name = "Tony";

        System.out.println("hello world");
        tony.intro();
    }
}
