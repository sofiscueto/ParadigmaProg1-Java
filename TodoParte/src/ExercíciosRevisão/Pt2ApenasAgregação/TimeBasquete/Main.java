package ExercíciosRevisão.Pt2ApenasAgregação.TimeBasquete;



public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta(1, "Lucas", "Armador");

        Time time = new Time(1, "Franca Basquete", "Helinho");
        time.contratarAtleta(atleta1);

        System.out.println("Atletas no time:");
        time.listarAtletas();

        // Anulando o time (quebra da agregação)
        time = null;

        System.out.println("\nMesmo após excluir o time:");
        System.out.println("Atleta1 ainda existe: " + atleta1);
        // O atleta continua acessível porque é uma referência independente
    }
}
