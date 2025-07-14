import java.util.Scanner;

public class Arrays_Q2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double[] a={137.4,155.2,149.3,160,155.6,149.7};
        double[] b={80.9,92.62,97.93,100.25,68.95,120};
        double[] angle={0.78,0.89,1.35,9,1.25,1.75};
        int[] plot={1,2,3,4,5,6};
        double[] Area=new double[6];
        double maxArea = Double.NEGATIVE_INFINITY;
        int maxPlot = -1;
        double max=Integer.MIN_VALUE;

        for(int i=0;i<6;i++){

            Area[i]=(0.5)*a[i]*b[i]*Math.sin(angle[i]);
            max= Math.max(max,Area[i]);
            System.out.println(Area[i]);

        }
        for (int i = 0; i < Area.length; i++) {
            if (Area[i] > maxArea) {
                maxArea = Area[i];
                maxPlot = i + 1; // +1 because plot numbers start from 1
            }
        }



        System.out.println("Plot with Max Area  is : "+ maxPlot);

    }
}
