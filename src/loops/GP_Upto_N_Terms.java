package loops;

import java.util.Scanner;

public class GP_Upto_N_Terms {
    public static void main(String[] args) {
        Scanner gp = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = gp.nextInt();
        int a =1, r = 2;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a = a*r;
        }
    }
}
