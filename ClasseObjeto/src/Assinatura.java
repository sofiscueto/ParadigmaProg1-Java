public class Assinatura {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    // Método Construtor
    public Assinatura(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;

        // Definindo mensalidade de acordo com o plano
        if(plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }
        else if(plano.equals("Premium")){
            this.mensalidade = 45.90f;
        }
        else if(plano.equals("Família")){
            this.mensalidade = 60.90f;
        }
        else{
            this.mensalidade = 0;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Método assistir filme
    public void assistirFilme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }
        else{
            System.out.println("Conta suspensa! Pague a fatura para continuar assistindo.");
        }
    }

    // Método cancelar assinatura
    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    // Método toString
    public String toString(){
        return "Dados da Assinatura:\n" +
               "Usuário: " + this.usuario + "\n" +
               "Plano: " + this.plano + "\n" +
               "Mensalidade: R$ " + this.mensalidade + "\n" +
               "Status: " + (this.ativo ? "Ativo" : "Suspenso") + "\n" +
               "Último filme assistido: " + this.ultimoFilmeAssistido + "\n";
    }
}