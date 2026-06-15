package Array;

import java.util.Scanner;

public class Output_Input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,-8,2,67,43,-97,6,23,89};
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        // Default Values
         int[] purab = new int[7];
//        for(int i =0;i<7;i++){
//            System.out.print(purab[i]+" ");
//        }
        // input
         for(int i =0;i<7;i++){
            purab[i] = sc.nextInt();
         }

        for(int i =0;i<7;i++){
            System.out.print(2*purab[i]+" ");
        }
    }
}
