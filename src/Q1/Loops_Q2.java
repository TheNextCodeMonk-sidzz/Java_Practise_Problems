package Q1;

import java.util.Scanner;

public class Loops_Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Numbers :");
        int num=sc.nextInt();
        int posCount=0;
        int negCount=0;
        int zeroCount=0;

        while(true){

            System.out.println("Do you want to continue ? (y/n)");
            String ans=sc.next();
            if(ans.equals("n")){
                break;
            }
            System.out.println("Enter The Numbers :");
            num=sc.nextInt();

            if(num==0){
                zeroCount+=1;

            }
            else if(num>0){
                posCount+=1;
            }else if (num<0) {
                negCount+=1;

            }
            else
                break;

        }
        System.out.println("Pos : " + posCount + " Neg :"+ negCount + " ZeroCount :" + zeroCount);
    }
}
