package ExercíciosRevisão.Pt3ApenasComposição.EdifícioeApartamentos;

public class Main {
    public static void main(String[] args) {

        Edificio edificio = new Edificio("Residencial Sol", "Rua A");

        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(102, 1);
        edificio.construirApartamento(201, 2);

        edificio.listarApartamentos();

        // removendo o edifício
        edificio = null;
        System.out.println("\nEdifício removido.");
    }
}
