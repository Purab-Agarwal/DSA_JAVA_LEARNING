package loops;

import java.util.Scanner;

public class Print_Sum_Of_Digits_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if(n<0)n=-n;
        int sum = 0;
        while(n != 0){
            sum += n%10;
             n = n*10;
        }
        System.out.println(sum);
    }
}