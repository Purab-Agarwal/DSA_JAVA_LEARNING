package if_else;

import java.util.Scanner;

public class Ternary_In_Variable {
    public static void main(String[] args) {
        Scanner tv = new Scanner (System.in);
        System.out.print("Enter Value: ");
        int n = tv.nextInt();

        int purab = (n>=0) ? 100 : 0;

        System.out.println(purab);
    }
}
