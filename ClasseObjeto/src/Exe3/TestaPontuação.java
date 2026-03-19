package Exe3;

public class TestaPontuacao {

    public static void main(String[] args) {

        Pontuacao jogo = new Pontuacao("Lakers", "Bulls");

        // Registrando pontos
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 1);

        System.out.println(jogo.toString());

        // Próximo quarto
        jogo.proximoQuarto();

        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("visitante", 3);

        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto(); // deve avisar que o jogo terminou

        System.out.println(jogo.toString());
    }
}