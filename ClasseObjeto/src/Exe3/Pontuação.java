package Exe3;

public class Pontuacao {

    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    // Método construtor
    public Pontuacao(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Método para registrar ponto
    public void registrarPonto(String time, int tipo){

        if(time.equals("casa")){
            this.pontosCasa += tipo;
        }
        else if(time.equals("visitante")){
            this.pontosVisitante += tipo;
        }
        else{
            System.out.println("Time inválido!");
        }
    }

    // Método para avançar o quarto
    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º quarto.");
        }
        else{
            System.out.println("O jogo já terminou!");
        }
    }

    // Método toString
    public String toString(){
        return this.nomeTimeCasa + " " + this.pontosCasa +
               " x " +
               this.pontosVisitante + " " + this.nomeTimeVisitante +
               " - Período: " + this.periodoQuarto;
    }
}