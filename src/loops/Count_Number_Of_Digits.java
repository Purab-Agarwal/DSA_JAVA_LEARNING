package loops;

import java.util.Scanner;

public class Count_Number_Of_Digits {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sb.nextInt();
        if (n==0)n=7;
        int count = 0;
        while(n !=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
