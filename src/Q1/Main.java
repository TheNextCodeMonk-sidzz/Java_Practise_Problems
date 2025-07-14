package Q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int Basic_Salary=sc.nextInt();

        int Dearness_Allowance = (40*Basic_Salary)/100;
        int House_Rent=(20*Basic_Salary)/100;
        int Gross_Salary= Basic_Salary+Dearness_Allowance+House_Rent;

        System.out.println("Gross salary is :" + Gross_Salary);

    }
}
