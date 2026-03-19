package Exe1;

public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // construtor vazio
    public ArCondicionado() {
    }

    // construtor com parâmetros
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m.length() >= 3) {
            marca = m;
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
        }
    }

    private boolean verificarCompressor() {
        double numero = Math.random() * 5;
        if (numero > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Marca: " + marca +
               "\nModelo: " + modelo +
               "\nTemperatura: " + temperatura +
               "\nLigado: " + ligado;
    }
}