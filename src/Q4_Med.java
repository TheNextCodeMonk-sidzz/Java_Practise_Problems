public class Q4_Med {
    public static void main(String[] args){

        for(int y=1; y<=6;y++){
            for (double x=5.5; x<=12.5; x+=0.5){
                double i= 2 + (y +0.5*x);

                System.out.println(i+"      "+y+"     "+x);
            }

        }

    }
}
