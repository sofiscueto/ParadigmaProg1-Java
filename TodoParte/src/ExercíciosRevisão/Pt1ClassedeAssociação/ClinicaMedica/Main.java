package ExercíciosRevisão.Pt1ClassedeAssociação.ClinicaMedica;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Medico med1 = new Medico(1, "Dr. João", "Cardiologia");
        Paciente pac1 = new Paciente(1, "Maria", "123.456.789-10");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 0);

        Consulta consulta = new Consulta(dataConsulta, 200.0, med1, pac1);

        System.out.println(consulta);
    }
}