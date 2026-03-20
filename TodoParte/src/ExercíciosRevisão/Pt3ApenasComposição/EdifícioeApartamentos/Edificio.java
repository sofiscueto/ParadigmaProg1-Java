package ExercíciosRevisão.Pt3ApenasComposição.EdifícioeApartamentos;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void construirApartamento(int num, int andar) {
        Apartamento ap = new Apartamento(num, andar);
        apartamentos.add(ap);
    }

    public void listarApartamentos() {
        System.out.println("Edifício: " + nome);
        for (Apartamento ap : apartamentos) {
            System.out.println(ap);
        }
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
