package Basic_Sorting;

public class Selection_Sort_2 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={8,7,6,2,3,4,-9,-8,5};
        int n = arr.length;
        print(arr);

        for(int i =n-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            int a = 0;
            for(int j=i;j>=0;j--) {
                if (max < arr[j]) {
                    max=arr[j];
                    a=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
        print(arr);
    }
}
