package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_In_Java_Basic {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(13);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3,50);

        System.out.println(arr);// not tervesing the array by our self
        int n = arr.size();//arr.length
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //arr is 25,21,18,50,10
        arr.add(78);//arr looks like 25,21,18,50,10,78
        arr.add(1,100);
        System.out.print(arr);
        System.out.println();
        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        //Collections.reverse(arr);
        System.out.print(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
    }
}
