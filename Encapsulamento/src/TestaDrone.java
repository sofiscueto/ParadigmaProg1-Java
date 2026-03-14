public class TestaDrone {

    public static void main(String[] args) {

        Drone d = new Drone();

        d.setBateria(80);

        d.decolar();

        d.subir(10);

        d.descer(5);
    }
}