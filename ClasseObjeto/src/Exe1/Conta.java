package Exe1;

public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    //Método Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCLiente;
        this.saldo = 0.0f; //inicializa com zero
        this.status = true; //inicializa ativa
    }

    //Método de Comportamento
    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito de R$: " + valor + " realizado com sucesso");
        }
        else {
            System.out.println("Erro: Não é possível depositar em uma conta encerrada!");
        }
    }

    public void sacar(float valor){
        if(this.status) {
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Saque de R$: " + valor + " realizado!");
            }
            else {
                System.out.println("Erro: Saldo insuficiente para o saque!");
            }
        }
        else {
            System.out.println("Erro: Exe1.Conta inválida!");
        }
    }

    public void encerrarConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Exe1.Conta encerrada com sucesso!");
        }
        else {
            System.out.println("Erro: Exe1.Conta possui saldo. Saque antes de encerrar.");
        }
    }

    public String toString(){
        return "Dados da conta: \n" +
                "Cliente: " + this.nomeCliente + "\n" +
                "Agência: " + this.agencia + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Status: " + (this.status ? "Ativa" : "Encerrada") + "\n";
    }
}
