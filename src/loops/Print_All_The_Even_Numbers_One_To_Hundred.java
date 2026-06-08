package loops;

public class Print_All_The_Even_Numbers_One_To_Hundred {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            System.out.print(i+" ");
            if(i==13)continue;
            System.out.println("Good Morning");
        }
    }
}
