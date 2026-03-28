package Exe1;

public class Main{
    public static void main(String[] args) {

        Aviao aviao = new Aviao("Boeing", "737", 250f, 12000f);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model 3", 120f, 400);

        Veiculo v;

        // Polimorfismo com avião
        v = aviao;
        v.mover();

        // Polimorfismo com carro elétrico
        v = carro;
        v.mover();
    }
}