package if_else;

import java.util.Scanner;

public class Ternary_Basic {
    public static void main(String[] args) {
        Scanner ternary = new Scanner (System.in);
        System.out.print("Enter Value: ");
        int n = ternary.nextInt();

//        if(n%2 == 0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}