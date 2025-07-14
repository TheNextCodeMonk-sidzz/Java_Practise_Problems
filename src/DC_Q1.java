import java.util.Scanner;

public class DC_Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character :");
        char letter=sc.next().charAt(0);

        String res=(letter>='a' && letter<='z')? "Letter is lowercase" : "letter is not lowercase";
        String result=(!Character.isLetterOrDigit(letter)?"Letter is Special Case" : "Letter is not Special case");

        System.out.println(res +" and"+ result);


    }
}
