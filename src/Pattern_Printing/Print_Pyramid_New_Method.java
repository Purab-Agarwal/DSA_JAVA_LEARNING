package Pattern_Printing;
import java.util.Scanner;
public class Print_Pyramid_New_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int nsp = n-1, nst = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nsp = nsp-1;
            nst = nst + 2;
            System.out.println();
        }
    }
}
