package loops;

import java.util.Scanner;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=n;i++){
            fact = fact * i;
        }
        System.out.print(fact);
    }
}
