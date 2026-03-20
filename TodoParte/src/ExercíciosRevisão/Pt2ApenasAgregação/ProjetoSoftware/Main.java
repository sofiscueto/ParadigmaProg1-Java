package ExercíciosRevisão.Pt2ApenasAgregação.ProjetoSoftware;

public class Main {
    public static void main(String[] args) {

        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Carlos", "Python");

        Projeto projeto = new Projeto(1, "Sistema Bancário");

        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);

        projeto.listarProgramadores();
    }
}
