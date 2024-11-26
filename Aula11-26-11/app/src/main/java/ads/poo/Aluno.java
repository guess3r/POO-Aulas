package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Aluno {
    //Nome, uma matricula,n telefones, filiação(nome mãe e pai),disciplinas

    //Atributos

    private String nome;
    private String matricula;
    private ArrayList<String> telefone;
    private String nomePai;
    private String nomeMae;
    private HashSet<String> disciplinas;

    // Construtor

    public Aluno(String nome, String matricula, String nomePai, String nomeMae) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.telefone = new ArrayList<>();
        this.disciplinas = new HashSet<>();
    }

    //Metodos

    public boolean adicionarDisciplina(String d){
        return this.disciplinas.add(d);
    }

    public boolean adicionarTelefone(String t) {
        return this.telefone.add(t);
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Matrícula: ").append(this.matricula);
        sb.append("\nNome: ").append(this.nome);
        sb.append("\nFiliação:");
        sb.append("\n -Pai: ").append(this.nomePai);
        sb.append("\n -Mãe: ").append(this.nomeMae);
        sb.append("\nTelefones:");
        for(String elemento: telefone){
            sb.append("\n -").append(elemento);
        }
        sb.append("\nDisciplinas:");
        for(String elemento: disciplinas){
            sb.append("\n -").append(elemento);
        }

        return sb.toString();
    }
}
