package com.bridlabz;
import java.util.*;

public class wageformonth {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // a=employee wage per Hr
        // b= employee days Hr
        // c= employee wages for month
        // x = enter no. of Employee

        int x = obj.nextInt();
        int a = 20;
        int b = 8;
        int c = 20;

        System.out.println("Employee Month wage =");
        System.out.println(a*b*c*x);



    }
}
