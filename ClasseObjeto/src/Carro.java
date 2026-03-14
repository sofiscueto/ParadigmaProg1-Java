public class Carro {
    //variaveis
    public String marca, modelo; //Classe
    public float velocidade; //tipo primitivo
    public boolean motor; //tipo primitivo

    //metodos da classe
    //metodo construtor - constroe o objeto e inicializa as váriaveis
    public Carro(String marca, String modelo){
        //marca e valor do usuário
        //this.xxx é o valor dentro do objeto
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;
    }

    // ligar o carro
    public void ligar(){
        if(!this.motor) { //(!) NOT - se o carro não estiver ligado
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }

    // desligar o carro
    public void desligar(){
        if(this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Carro foi desligado");
        }
    }

    // acelerar o carro
    public void acelerar(float x){
        if(this.motor){
            this.velocidade = this.velocidade + x;
            System.out.println("O carro está acelerado á " + this.velocidade + "km");
        }
        else System.out.println("Não foi possivel acelerar!");

    }

    //frear o carro
    public void frear(float x){
        if(this.motor && this.velocidade - x >= 0){
            this.velocidade = this.velocidade - x;
            System.out.println("O carro foi freado " + this.velocidade + "km");
        }
        else System.out.println("Não foi possivel frear!");
    }

    //converter objeto em string
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo
                + " Velocidade: " + this.velocidade + " Motor: "
                //operador ternario, troca o if por ? e o else por :
                +  (this.motor ? "Ligado" : "Desligado");
    }
}