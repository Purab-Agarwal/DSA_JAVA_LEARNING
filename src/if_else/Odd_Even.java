package if_else;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner kanu = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int laddu = kanu.nextInt();
        if(laddu%2 == 0){
            System.out.println("Even Number");
            System.out.println("Jhandu And Bam");
        }
        else{
            System.out.println("Odd Number");
            System.out.println("Jhandu or Bam");
        }
    }
}
