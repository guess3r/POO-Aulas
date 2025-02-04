package ads.poo;

import java.time.LocalDate;

public abstract class Pessoa  {

    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public abstract String mover();

}
