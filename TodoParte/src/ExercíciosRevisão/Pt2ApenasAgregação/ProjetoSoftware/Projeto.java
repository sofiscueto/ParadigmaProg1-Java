package ExercíciosRevisão.Pt2ApenasAgregação.ProjetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        System.out.println("Projeto: " + nomeProjeto);
        for (Programador p : programadores) {
            System.out.println(p);
        }
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
