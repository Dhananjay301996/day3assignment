package com.bridlabz;
import java.util.Random;
import java.util.Scanner;

public class snakeandladderdice {
    public static void main(String[] args) {

        System.out.println("Enter the no.");

        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        Random obj1 = new Random();

        do{
            System.out.println("Value of dice are");

            for(int i=0; i<n; i++)
                System.out.println(obj1.nextInt(6)+1);
            System.out.println("continue: true/false");
        } while (obj.nextBoolean()== true );

    }
}
