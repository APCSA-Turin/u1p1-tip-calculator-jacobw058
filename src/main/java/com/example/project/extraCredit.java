package com.example.project;

import java.util.Scanner;

public class extraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       double tipTotal = (double) ((int) (((cost * ((double) percent / 100)) * 100) + 0.5)) / 100;
                       double totalCost = (cost + tipTotal); 
                       double noTipPerPerson = (double) ((int) ((cost / ((double) people / 100)) + 0.5)) / 100;
                       double tipPerPerson = (double) ((int) (((tipTotal / people) * 100) + 0.5)) / 100; 
                       double totalPerPerson = (double) ((int) ((totalCost / people) * 100)) / 100; 
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tipTotal + "\n");
        result.append("Total Bill with tip: $" + totalCost + "\n"); 
        result.append("Per person cost before tip: $" + noTipPerPerson + "\n");
        result.append("Tip per person: $" + tipPerPerson + "\n");
        result.append("Total cost per person: $" + totalPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
    String item = "";
    String items = "";
    while (item != "-1") {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an item name or type -1 to finish: ");
        item = scanner.nextLine();
        items += item;
    }

    // code below the while loop runs after the loop ends
    System.out.print("You entered 'x' :( ");

        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
