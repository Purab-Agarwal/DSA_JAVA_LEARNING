package Pattern_Printing;

import java.util.Scanner;

public class Floid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int purab = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1;j<=i;j++){
                System.out.print(purab++ +" ");

            }
            System.out.println();
        }
    }
}
