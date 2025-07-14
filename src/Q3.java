import com.sun.jdi.Value;

import java.util.Scanner;

public class Q3 {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 digit Number :");
        int value=sc.nextInt();

        int res=0;
        while(value !=0){
            int num=value%10;
            res= res*10+num;
            value=value/10;



        }

        System.out.println("Reverse of the number is :"+ res);
    }
}
