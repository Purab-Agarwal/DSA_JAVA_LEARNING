package loops;

import java.util.Scanner;

public class Arithmatic_Progression_using_loop {
    public static void main(String[] args) {
        Scanner sb = new Scanner (System.in);
        System.out.print("Enter N (Number Of Terms): ");
        int n = sb.nextInt();
        System.out.print("Enter A (First Trem): ");
        int a = sb.nextInt();
        System.out.print("Enter D (Common Difference): ");
        int d = sb.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print(a + " ");
            a = a+d;
        }
    }
}
