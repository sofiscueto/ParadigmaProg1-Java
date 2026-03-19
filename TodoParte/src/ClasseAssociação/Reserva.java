package ClasseAssociação;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//objeto-todo
public class Reserva {
    private int cod;
    private LocalDateTime data;
    private int poltona;
    //associação
    private Voo voo;
    private Passageiro passageiro;

    public Reserva() {
    }

    public Reserva(int cod, LocalDateTime data, int poltona, Voo voo, Passageiro passageiro) {
        this.cod = cod;
        this.data = data;
        this.poltona = poltona;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltona() {
        return poltona;
    }

    public void setPoltona(int poltona) {
        this.poltona = poltona;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        //formatando a data no Brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm'min'");
        return "\nReserva{" +
                "cod=" + cod +
                ", data=" + data.format(formatoBR) +
                ", poltona=" + poltona +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                '}';
    }
}
