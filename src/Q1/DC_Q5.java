package Q1;

import java.util.Scanner;

public class DC_Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter Your Choice :");
        System.out.println("Addition");
        System.out.println("Substraction");
        System.out.println("Division");
        System.out.println("Multiplication");
        sc.nextLine();
        String operation=sc.nextLine();

        switch(operation){
            case "Addition" :
                System.out.println("Addition : " + (x+y));
                break;
            case "Substraction" :
                System.out.println("Substraction : "+ (x-y));
                break;
            case "Multiplication" :
                System.out.println("Multiplication : "+ (x*y));
                break;
            case "Division" :
                System.out.println("Division : "+ ((double)x/y));
                break;
            default:
                System.out.println("Invalid selection");
            };


    }
        }






