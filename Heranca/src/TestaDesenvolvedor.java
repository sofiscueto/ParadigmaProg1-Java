
public class TestaDesenvolvedor {
    public static void exibir(Desenvolvedor camaleao){
        //polimorfismo
        camaleao.codar();
        //polimorfismo
        System.out.println(camaleao.toString() + "Bônus" + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        //criar um objeto Desenvolvedor

        Desenvolvedor dev1 = new Desenvolvedor();

        //criar um junior
        Junior jr1 = new Junior("Pompeu", "Java", 4000, "Pedro");
        exibir(jr1);

        //criar um pleno
        Pleno pl1 = new Pleno("Pedro", "Java", 5000, 5);
        exibir(pl1);

        //criar um senior
        Senior sn1 = new Senior("Sofia", "Java", 6000, 3000);
        exibir(sn1);
    }
}
