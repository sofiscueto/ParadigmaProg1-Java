import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(String professor, String nome, int id) {
        this.professor = professor;
        this.nome = nome;
        this.id = id;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void matricularAluno(Aluno a){
        this.alunos.add(a);
        System.out.println("Aluno matriculado com sucesso");
    }

    public void criarAvaliacao(int id, String nome){
        Avaliacao a = new Avaliacao(id, nome);
        this.avaliacoes.add(a);
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=" + alunos +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
