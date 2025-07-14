package Q1;

public class Pattern_Que {
    public static void main(String[] args){
//        int count=1;
//        int num=1;
//        1
//        23
//        456
//        78910
//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=count;j++){
//                System.out.print(num);
//                num++;
//            }
//            count++;
//
//            System.out.println();
//
//        }

        //...........................outer rectangle figure.................

//        int n=4;
//        int m=5;
//        *****
//        *   *
//        *   *
//        *****
//
//
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n|| j==m)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            System.out.println();
//
//        }


        //.......... first half diagonal

//
 // Pyramid.....................
        int rows = 4;
        int num = 1; // to print incrementing numbers

        for (int i = 1; i <= rows; i++) {

            // print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println(); // move to next line
        }

    }
}
