package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public boolean addTelefone(String r, String v){
        telefones.add(new Telefone(r,v));
        return true;
    }


}
