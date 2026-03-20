package ExercíciosRevisão.Pt4AgregCompCombinadas.SistCineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // agregação
    private ArrayList<Ingresso> ingressos; // composição

    public Sessao() {
    }

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ing = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ing);
    }

    public void exibirSessao() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm'min'");
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Horário: " + horario.format(formatoBR));
        System.out.println("Sala: " + sala);

        for (Ingresso i : ingressos) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        //formatando a data no Brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm'min'");
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario.format(formatoBR) +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}
