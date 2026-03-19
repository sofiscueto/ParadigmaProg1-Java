package Exe1;

public class TestaAcademico {

    public static void main(String[] args) {

        Aluno al1 = new Aluno("Engenharia de Software", "26478", "Sofia", 9);
        Aluno al2 = new Aluno("Engenharia de Produção", "25846", "Pedro", 10);

        Disciplina d1 = new Disciplina("Daniel", "POO", 2);

        d1.matricularAluno(al1);
        d1.matricularAluno(al2);

        d1.criarAvaliacao(1, "Lição Semestral");

        Avaliacao av1 = d1.getAvaliacoes().get(0);

        av1.adicionarQuestao(1, "O que é POO?", 2);
        av1.adicionarQuestao(2, "Explique encapsulamento", 3);
        av1.adicionarQuestao(3, "O que é composição?", 5);

        System.out.println(d1.toString());
    }
}