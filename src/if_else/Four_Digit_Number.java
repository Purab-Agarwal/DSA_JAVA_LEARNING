package if_else;

import java.util.Scanner;

public class Four_Digit_Number {
    public static void main(String[] args) {
        Scanner four = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = four.nextInt();

        if(n>999 && n<10000) {
            System.out.println("Four Digit NUmber");
        }
        else System.out.println("Not An Four Digit Number");
    }
}
