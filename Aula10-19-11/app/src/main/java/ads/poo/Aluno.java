package ads.poo;

import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {
    //Nome, uma matricula,n telefones, filiação(nome mãe e pai),disciplinas

    //Atributos

    private String nome;
    private int matricula;
    private ArrayList<String> telefone;
    private String[] filiacao;
    private HashSet<String> disciplinas;

    // Construtor

    public Aluno(String nome, int matricula, String[] filiacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.filiacao = filiacao;
        this.telefone = new ArrayList<>();
        this.disciplinas = new HashSet<>();
    }

    //Metodos

    public boolean adicionarDisciplina(String d){
        return this.disciplinas.add(d);
    }


}
