public class TestaVetorPolimorfico {

    public static void main(String[] args) {

        // Vetor do tipo da superclasse
        Desenvolvedor[] devs = new Desenvolvedor[4];

        // Preenchendo com objetos diferentes (polimorfismo)
        devs[0] = new Junior("Ana", "Java", 4000f, "Carlos");
        devs[1] = new Pleno("Bruno", "Python", 5000f, 3);
        devs[2] = new Senior("Sofia", "Java", 6000f, 2000f);
        devs[3] = new Desenvolvedor("Nome", "Linguegem", 3000f);

        // Percorrendo o vetor
        for (Desenvolvedor d : devs) {

            d.codar(); // polimorfismo

            System.out.println("Bônus: " + d.calcularBonus()); // polimorfismo

            System.out.println(d.toString());
        }
    }
}