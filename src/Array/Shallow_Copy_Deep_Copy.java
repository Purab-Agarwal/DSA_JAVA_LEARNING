package Array;

import java.util.Arrays;

public class Shallow_Copy_Deep_Copy {
    public static void main(String[] args) {
        int a = 4; //takes 4 bytes
        int[] arr={10,20,30,40};
//        int[] x= arr; // x is shallow copy of arr
//        x[0] = 100;
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0]=100;
        System.out.println(arr[0]);
    }
}