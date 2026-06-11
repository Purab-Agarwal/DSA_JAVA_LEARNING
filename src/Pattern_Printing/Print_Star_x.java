package Pattern_Printing;

import java.util.Scanner;

public class Print_Star_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n =sc.nextInt();
        if(n<0)n=-n;
        if(n%2==0)n=n+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i + j == n + 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
