package ExercíciosRevisão.Pt1ClassedeAssociação.SistemaBibioteca;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor(1, "Sofia");
        Livro livro = new Livro(1, "Eleanor & Gray", "Brittainy C. Cherry");

        LocalDateTime dataEmprestimo = LocalDateTime.of(2026, 3, 20, 10, 0);
        LocalDateTime devolucao = LocalDateTime.of(2026, 3, 27, 10, 0);

        Emprestimo emp = new Emprestimo(dataEmprestimo, devolucao, leitor, livro);

        System.out.println(emp);
    }
}
