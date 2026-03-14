public class TestaCarro {
    //o > aciona o JDK - compila + interpreta
    public static void main(String args[]){
        //cria uma instância da Classe Carro - objeto

        /*
        Forma simples:
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        //exibir os dados
        System.out.println(obj1.toString());
        */

        Carro obj1 = new Carro("Fiat", "Uno");
        System.out.println("Carro 1");
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(110);
        obj1.frear(120);
        obj1.desligar();
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("GM", "Onix");
        System.out.println("\nCarro 2");
        System.out.println(obj2.toString());
        obj2.acelerar(58);
        obj2.desligar();
        System.out.println(obj2.toString());

        Carro obj3 = new Carro("Hyundai", "HB20");
        System.out.println("\nCarro 3");
        System.out.println(obj3.toString());
        obj3.ligar();
        obj3.acelerar(20);
        obj3.frear(10);
        System.out.println(obj3.toString());
    }
}
