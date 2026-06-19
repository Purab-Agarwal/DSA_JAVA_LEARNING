package Array;

public class Reverse_Array {
    public static void main(String[] args){
        int[] arr={6,8,1,2,4,7,9};
        int n = arr.length;
        for(int i=0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }
//        int i =0,j=n-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
