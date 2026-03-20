package ExercíciosRevisão.Pt4AgregCompCombinadas.SistVendasSupermercado;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Arroz", 20);
        Produto p2 = new Produto(2, "Feijão", 10);

        Cliente cliente = new Cliente(1, "Maria");

        Venda venda = new Venda(cliente);

        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 3, p2);

        venda.listarVenda();
    }
}
