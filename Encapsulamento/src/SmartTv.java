public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean ConectadaInternet;

    public SmartTv(){ //SmartTv obj1 = new SmartTv()
        this.marca = " ";
        this.modelo = " ";
        this.ConectadaInternet = false;
    }

    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        // removido erro da chamada incorreta de ConectaInternet
    }

    // setters = gatters
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }

    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        //A primeira letra da marca precisa ser maiuscula
        Character aux = marca.charAt(0);
        //char = tipo primitivo
        //Character = classe
        boolean resp = Character.isUpperCase(aux);

        if(resp) {
            this.marca = marca;
        }
        else{
            System.out.println("Marca Inválida");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo){
        if(modelo.length() <= 30) {
            this.modelo = modelo;
        }
        else System.out.println("Modelo Inválido");
    }

    public String getModelo(){
        return this.modelo;
    }

    public void abrirYouTube(){
        if(this.ConectaInternet()){
            System.out.println("Abrindo YouTube");
        }
        else{
            System.out.println("Sem internet para abrir o YouTube");
        }
    }

    //so pode ser usado nessa classe
    private boolean ConectaInternet(){
        System.out.println("Buscando sinal de wifi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando IP no roteador");

        int randon = (int)(Math.random() * 10);

        if (randon < 5){
            this.ConectadaInternet = true;
            return true;
        }
        else{
            this.ConectadaInternet = false;
            return false;
        }
    }

    //aumenta o volume da SmartTV
    public void aumentaSom(int x){
        this.setVolume(this.volume + x);
    }
    //abaixa o volume da SmartTv
    public void diminuiSom(int x){
        this.setVolume(this.volume - x);
    }

    public String toString(){
        return ("Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nVolume: " + this.volume +
                "\nConectada a internet?: " +
                (this.ConectadaInternet ? "Sim" : "Não"));
    }
}


