package if_else;

import java.util.Scanner;

public class Three_Positive_Integers_Which_Is_Greatest {
    public static void main(String[] args) {
        Scanner greatest = new Scanner (System.in);
        System.out.print("Enter First Value: ");
        int a = greatest.nextInt();
        System.out.print("Enter Second Value: ");
        int b = greatest.nextInt();
        System.out.print("Enter Third Value: ");
        int c = greatest.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if (b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
