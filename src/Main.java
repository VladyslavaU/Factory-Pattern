public class Main {
    public static void main(String[] args) {
        Margherita margherita = new Margherita();
        System.out.println("Pizza Margherita:");
        margherita.cook();
        System.out.println("=============================");

        MargheritaExtra margheritaExtra = new MargheritaExtra();
        System.out.println("Pizza Margherita Extra:");
        margheritaExtra.cook();
        System.out.println("=============================");

        Marinara marinara = new Marinara();
        System.out.println("Pizza Marinara:");
        marinara.cook();
        System.out.println("============================");
    }
}
