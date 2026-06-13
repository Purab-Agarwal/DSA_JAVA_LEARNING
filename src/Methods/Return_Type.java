package Methods;

public class Return_Type {
    public static int purab(int a){
        System.out.println("Pizza");
        System.out.println("Burger");
        if(a>0) return 5;
        else return 10;
    }
    public static void main(String[] args) {
        int x = purab(5);
        System.out.println(3+x);
    }
}
