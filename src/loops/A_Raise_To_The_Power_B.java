package loops;

import java.util.Scanner;

public class A_Raise_To_The_Power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int result = 1;
        for (int i = 1; i<=b; i++){
            result = result * a;
        }
        System.out.print(a+" raised to the power "+b+" is "+result);
    }
}
