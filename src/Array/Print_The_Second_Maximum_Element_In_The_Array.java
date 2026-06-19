package Array;

public class Print_The_Second_Maximum_Element_In_The_Array {
    public static void main(String[] args) {
        int[] arr={4,3,10,9,8,7,6,5,4,3,2,1};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        //Calculate max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i] != max) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}