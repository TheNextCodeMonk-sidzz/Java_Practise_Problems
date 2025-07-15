package Methods_Problems;
import java.util.Arrays;

public class Q2_Static_non_Static {

    public static int[] rightSwap(int x, int y, int z){
        //a=5,b=8,c=10
        int temp=x;
        x=y;
        y=z;
        z=temp;



        return new int[]{x,y,z};
    }
    public static int[] leftswap(int x, int y, int z){

        int temp=z;
        z=y;
        y=x;
        x=temp;

        return new int[]{x,y,z};
    }
    public static void main(String[] args){
            int a=5;
            int b=8;
            int c=10;
    //right swap
            int[] right=rightSwap(a,b,c);
            System.out.println(Arrays.toString(right));

            right=rightSwap(right[0],right[1],right[2]);
            System.out.println(Arrays.toString(right));
    //left swap
            int[] left=leftswap(a,b,c);
            System.out.println(Arrays.toString(left));

            left=leftswap(left[0],left[1],left[2]);
            System.out.println(Arrays.toString(left));


        }





























//    // using static keyword
////    public static int[] rightswap(int x,int y, int z){
////        int temp=x;
////        x=z;
////
////        y=temp;
////        z=y;
////
////
////        return new int[]{x,y,z};
////    }
//
//
//
////    int[] rightShift(int x, int y, int z){
////        // x=5 ->y=8->z=10
////        int temp=x;
////        x=z;
////        z=y;
////        y=temp;
////
////
////        return new int[]{x,y,z} ;
////
////
////
////
////    }
////
////    int[] leftShift(int x, int y, int z){
////        // x=5 ->y=8->z=10
////        int temp=x;
////        x=y;
////        y=z;
////        z=temp;
////        return new int[]{x,y,z};
////    }
////
//    public static int[] circularRightShift(int x, int y, int z) {
//        int temp = z;
//        z = y;
//        y = x;
//        x = temp;
//        return new int[]{x, y, z};
//    }
//
//    public static void main(String[] args){
//
////        int x=5;
////        int y=8;
////        int z=10;
//        //without static keyword
////        Q2_Static_non_Static obj=new Q2_Static_non_Static();
//
////        int[] right=obj.rightShift(x,y,z);
////        System.out.println(right[0] +" "+right[1]+" "+right[2]);
////
////        int[]left=obj.leftShift(x,y,z);
////        obj.leftShift(x,y,z);
////        System.out.println(left[0]+" "+ left[1]+" "+left[2]);
//
////        int a=5;
////        int b=8;
////        int c=10;
////
////        int[] result=obj.rightShift(a,b,c);
////        a = result[0];
////        b = result[1];
////        c = result[2];
////        System.out.println(a+" "+b+" "+c);
//
//
//
//
//
//
//
//
//
//        // with static keyword
////        rightswap(a,b,c);
////        System.out.println(a+ " "+b+" "+c);
////        rightswap(a,b,c);
////        System.out.println(a+ " "+b+" "+c);
//        int a = 5, b = 8, c = 10;
//
//        // Create objec
//        Q2_Static_non_Static obj= new Q2_Static_non_Static();
//
//        // Call method
//        int[] result = obj.circularRightShift(a, b, c);
//
//        // Assign shifted values back to a, b, c
//        a = result[0];
//        b = result[1];
//        c = result[2];
//        obj.circularRightShift(a, b, c);
//        System.out.println("After Circular Right Shift:");
//        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//        obj.circularRightShift(a, b, c);
//        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//
//
//    }
}
