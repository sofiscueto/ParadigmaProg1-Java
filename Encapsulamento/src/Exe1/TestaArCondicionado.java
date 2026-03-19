package Exe1;

public class TestaArCondicionado {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado("LG", "Dual", 24, true);

        System.out.println(ar);

        ar.ativarModoTurbo();

        System.out.println("\nDepois do modo turbo:");
        System.out.println(ar);
    }
}