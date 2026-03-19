package ClasseAssociação;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("51560270837", "Sofia");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 7, 6, 10, 30);
        Voo vo1 = new Voo(99, "São Paulo", "Grécia", data);
        System.out.println(vo1.toString());

        Reserva res1 = new Reserva(12, LocalDateTime.now(), 40, vo1, pas1);
        System.out.println(res1.toString());
    }
}
