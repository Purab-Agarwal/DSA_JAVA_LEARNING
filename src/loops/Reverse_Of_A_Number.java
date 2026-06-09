package loops;

import java.util.Scanner;

public class Reverse_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int original_number = n;
        int r = 0;
        while( n !=0){
            r = r*10;
            r = r + (n%10);
            n = n/10;
        }
        System.out.println(r);
        System.out.print(original_number + r);
    }
}
