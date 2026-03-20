package ExercíciosRevisão.Pt4AgregCompCombinadas.SistVendasSupermercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda() {
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public void adicionarItem(int id, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(id, quantidade, produto);
        itens.add(item);
    }

    public void listarVenda() {
        System.out.println("Cliente: " + cliente.getNome());

        double total = 0;

        for (ItemVenda item : itens) {
            System.out.println(item);
            total += item.calcularSubtotal();
        }

        System.out.println("Total: R$ " + total);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
