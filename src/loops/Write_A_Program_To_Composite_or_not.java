package loops;

import java.util.Scanner;

public class Write_A_Program_To_Composite_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                flag = false;
                break;
            }
        }
        if ( n == 1){
            System.out.println("Niether Prime Nor Composite");
        }
        else if (flag == false){
            System.out.println("Composite Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
