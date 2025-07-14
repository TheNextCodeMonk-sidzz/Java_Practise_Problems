import java.util.Scanner;

public class DC_Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int value=sc.nextInt();
        int original_val=value;
        int res=0;
        while(value>0){
            int num=value%10;
            res=res*10+num;
            value=value/10;
        }

        String ans=(original_val==res)?"Numbers are Equal" : "Numbers are not equal";
        System.out.println(ans + ":" + res );
    }
}
