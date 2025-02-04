package ads.poo;

import java.time.LocalDate;

public class Professor extends Pessoa{

    public Professor(String nome, LocalDate dataNasc) {
        super(nome, dataNasc);
    }

    @Override
    public String mover() {
        return "pr";
    }
}
