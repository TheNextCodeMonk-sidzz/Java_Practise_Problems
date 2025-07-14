import java.util.Scanner;

public class DC_Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x1 and y1 :");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter x2 and y3 :");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        System.out.println("Enter x3 and y3 :");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
// here we need to find slope and check against each other
        String res=((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1))? "Points are on the same line" : "Points are NOT on the same line";
        System.out.println(res);

    }
}
