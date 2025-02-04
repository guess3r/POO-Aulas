package ads.poo;

import java.time.LocalDate;

public class Estudante extends Pessoa{


    public Estudante(String nome, LocalDate dataNasc) {
        super(nome, dataNasc);
    }

    @Override
    public String mover() {
        return "es";
    }
}
