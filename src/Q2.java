import java.util.Scanner;

public class Q2 {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Km :");
        int value=sc.nextInt();

        int meters= value*1000;
        int centimeters=value*100000;
        Float feet=value*3280.84f;
        Float inches=value*39370.1f;

        System.out.println("Meters: " + meters);
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Inches : " + inches);
        System.out.println("Feet: " + feet);

        sc.close();




    }
}
