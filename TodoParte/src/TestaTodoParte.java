import java.util.Date;

public class TestaTodoParte {
    public static void main(){
        //Cliente é independente do pedido

        Cliente cl1 = new Cliente(100, "Pedro", "123", "Rua 10");
        Produto prod1 = new Produto(10, "Pincel", "Pincel para base", 10);
        Produto prod2 = new Produto(15, "Mouse", "Silencioso e sem fio", 50);
        Pedido pd1 = new Pedido(1, new Date(), cl1);
        pd1.adicionaItemPedido(11, 3, prod1);
        pd1.adicionaItemPedido(22, 8, prod2);


        System.out.println(pd1.toString());
    }
}
