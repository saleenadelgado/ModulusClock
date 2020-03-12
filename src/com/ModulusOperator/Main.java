package com.ModulusOperator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ModulusClock();
    }

    public static void ModulusClock()  {
    int hours;
    int minutes;
    Scanner keyboard;
    keyboard= new Scanner (System.in);
  System.out.println("Enter a value for hours");
hours = keyboard.nextInt();
System.out.println("Enter a value for minutes");
minutes = keyboard.nextInt();
       hours = minutes >=60 ? ++hours : hours;
       minutes = minutes %60 ;
     //minutes %= 60;
    hours = hours %12;
        System.out.printf("The time is: %d:%02d",hours,minutes );
    }
}
