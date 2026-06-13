package Methods;

public class Syntax {
    public static void main(String[] args) {
        System.out.println("Jalebi");
        purab();// function call/method call
    }

    public static void purab(){
        Laddu();
        System.out.println("Purab");
    }

    public static void Laddu(){
        Barfi();
        System.out.println("Pizza");
    }

    public static void Barfi(){
        System.out.println("Burger");
    }
}
