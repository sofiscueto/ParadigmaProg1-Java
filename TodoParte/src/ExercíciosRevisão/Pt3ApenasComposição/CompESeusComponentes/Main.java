package ExercíciosRevisão.Pt3ApenasComposição.CompESeusComponentes;

public class Main {
    public static void main(String[] args) {

        Computador pc = new Computador(1, "Dell");
        System.out.println(pc);

        // removendo o computador
        pc = null;
        System.out.println("Computador removido da memória.");
    }
}
