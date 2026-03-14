import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao() {
        this.questoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int id, String enunciado, float valor){
        Questao aux = new Questao(id, enunciado, valor);
        this.questoes.add(aux);
        System.out.println("Questão adicionada com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestaos() {
        return questoes;
    }

    public void setQuestaos(ArrayList<Questao> questaos) {
        this.questoes = questaos;
    }

    @Override
    public String toString() {
        return "\nAvaliacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", questaos=" + questoes +
                '}';
    }
}

