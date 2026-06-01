package Basic_Cheeze;
import java.util.Scanner;
public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner created
        System.out.print("Enter Radius: ");
        double r= sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
