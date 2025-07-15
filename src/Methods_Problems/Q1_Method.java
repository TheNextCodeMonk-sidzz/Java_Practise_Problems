package Methods_Problems;

import java.util.Scanner;


public class Q1_Method {

    public static void leapYear(int year){
        if(year%4==0)

             System.out.println("Its a leap year");
        else
             System.out.println("Its not a leap year");

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Desired Year :");
        int year=sc.nextInt();

        leapYear(year);
    }
}
