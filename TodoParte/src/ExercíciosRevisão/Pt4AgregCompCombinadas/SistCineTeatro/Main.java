package ExercíciosRevisão.Pt4AgregCompCombinadas.SistCineTeatro;

import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args) {

        Filme f1 = new Filme(1, "Homem Aranha", "Ação", 120);
        Filme f2 = new Filme(2, "Como eu era antes de você", "Romance", 150);

        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);

        Sessao sessao = new Sessao(1, data, 1);

        // agregação
        sessao.vincularFilme(f1);

        // composição
        sessao.venderIngresso(1, "A1", "Inteira", 30);
        sessao.venderIngresso(2, "A2", "Meia", 15);
        sessao.venderIngresso(3, "A3", "Inteira", 24);

        sessao.exibirSessao();
    }
}
