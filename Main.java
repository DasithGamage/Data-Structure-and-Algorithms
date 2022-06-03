package com.jetbrains;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// creating the linkedlist
        LinkedList<String> myList = new LinkedList <String>();

    //adding elements to linkedlist
        myList.add("David");
        myList.add("Anne");
        myList.add("Christopher");
        myList.add("Norton");
        myList.add("Charles");
        myList.add("Mrtin");

    //printing the linkedlist
        System.out.println(myList);

    //removing elements
        myList.remove("Christopher");


        System.out.println("New List : "+ myList);


        
        myList.add(1,"Otis");
        System.out.println("Updated New List : "+ myList);

    //changing elements
       myList.set(0,"Dave");
        System.out.println("My Name List : "+ myList);
    }
}
