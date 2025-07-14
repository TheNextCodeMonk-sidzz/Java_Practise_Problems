import java.util.Locale;
import java.util.Scanner;

public class Arrays_Q1 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        int[] q= new int[10];
        double[] p=new double[10];
        double[]r=new double[10];
        double[]a=new double[10];

        for (int i =0; i<10 ;i++){
            System.out.println("Enter Values of set"+ (i+1)+ ":");
            System.out.println("Principle p :");
            p[i]=sc.nextDouble();

            System.out.print("Rate % (r): ");
            r[i] = sc.nextDouble();

            System.out.print("Years (n): ");
            n[i] = sc.nextInt();

            System.out.print("Compounds per year (q): ");
            q[i] = sc.nextInt();
        }

        for(int i=0; i<10;i++){
            a[i]= p[i]*Math.pow( 1 + (r[i]/100) / q[i] , n[i]*q[i]);
        }

        System.out.printf("%-4s %-10s %-6s %-4s %-4s %-12s%n",
                "Set", "Principal", "Rate", "n", "q", "Amount");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-4d %-10.2f %-6.2f %-4d %-4d %-12.2f%n",
                    i + 1, p[i], r[i], n[i], q[i], a[i]);
        }

    }
}
