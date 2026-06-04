package if_else;

import java.util.Scanner;

public class Positive_Integer_Input_And_Print {
    public static void main(String[] args) {
        Scanner integer = new Scanner (System.in);
        System.out.print("Enter Value: ");
        int n = integer.nextInt();
        if (n%3 == 0 && n%5 == 0) {
            System.out.println("Divisible By 3 And 5");
        }
        else if (n%3 == 0){
            System.out.println("Divisible by 3");
        }
        else if (n%5==0){
            System.out.println("Divisible By 5");
        }
        else System.out.println("Not Divisible By 3 And 5");

    }
}
