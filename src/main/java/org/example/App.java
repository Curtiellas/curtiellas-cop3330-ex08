package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //scanning
        System.out.println("How many people?");
        int people = sc.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = sc.nextInt();

        System.out.println("How many slices per pizza?");
        int slicesPerPizza = sc.nextInt();

        //calculations
        int totalSlices = pizzas * slicesPerPizza;

        int slicesPerPerson = totalSlices / people;

        int leftoverSlices = totalSlices % people;

        //outputs
        System.out.println( people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftoverSlices + " leftover pieces.");
    }
}
