package Q1;

import java.util.Scanner;

public class DC_Q4 {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of hardness, carbon content and tensile strength :");
        int hardness=sc.nextInt();
        Double carbon_content= sc.nextDouble();
        int tensile_strength=sc.nextInt();

        if(hardness>50 && carbon_content <0.7 && tensile_strength>5600)
            System.out.println("Grade is 10");
        else if (hardness>50 && tensile_strength>5600) {
            System.out.println("Grade is 7");
        }
        else if (carbon_content<0.7 && tensile_strength>5600) {
            System.out.println("Grade is 8");
        }
        else if (hardness>50 && carbon_content<0.7) {
            System.out.println("Grade is 9");
        } else if (hardness>50 || carbon_content <0.7 || tensile_strength>5600) {
            System.out.println("Grade is 6");

        }
        else
            System.out.println("Grade is 5");
    }
}
