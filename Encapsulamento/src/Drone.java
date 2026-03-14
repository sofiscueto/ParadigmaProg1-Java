public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            altura = a;
        } else {
            System.out.println("Altura inválida");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            bateria = b;
        }
    }

    public void decolar() {
        if (bateria > 20) {
            if (testarMotores()) {
                emVoo = true;
                setAltura(2);
                System.out.println("Drone decolou!");
            }
        } else {
            System.out.println("Bateria muito baixa para decolar");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        double numero = Math.random() * 10;

        if (numero < 8) {
            return true;
        } else {
            return false;
        }
    }

    public void subir(float x) {
        setAltura(altura + x);
    }

    public void descer(float x) {
        setAltura(altura - x);
    }
}