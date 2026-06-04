package if_else;

import java.util.Scanner;

public class Sides_Of_A_Triangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner (System.in);
        System.out.print("Enter 1st Side: ");
        int a = triangle.nextInt();
        System.out.print("Enter 2nd Side");
        int b = triangle.nextInt();
        System.out.print("Enter 3rd Side: ");
        int c = triangle.nextInt();

        if(a+b>c && a+c>b && b+c>a)
            System.out.println("Valid Triangle: ");
        else System.out.println("Invalid Triangle");
    }
}