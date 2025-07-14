package Q1;

import java.util.Scanner;

public class Loops_Q1 {
    static int fact(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Factorial of "+ n +" is "+ fact(n));


    }
}
