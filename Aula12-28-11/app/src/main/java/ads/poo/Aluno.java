package ads.poo;

import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {

    //nome, matricula, n telefones, filiaçao (pai e mae), string disciplinas q o aluno cursa,
    private String nome;
    private String matricula;
    private ArrayList<String> telefones;
    private String nomeMae;
    private String nomePai;
    private HashSet<String> disciplinas;

    public Aluno(String nome, String matricula, String nomeMae, String nomePai) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.telefones = new ArrayList<>();
        this.disciplinas = new HashSet<>(); //hash set pra nao repetir a disciplina
    }

    public boolean adicionarDisciplina(String d) {
        return this.disciplinas.add(d);
    }

    public boolean adicionarTelefone(String t) {
        return this.telefones.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Matricula: ").append(matricula);
        sb.append("\nNome: ").append(nome);
        sb.append("\nFiliação: ");
        sb.append("\nPai: ").append(nomePai);
        sb.append("\nMãe: ").append(nomeMae);
        sb.append("\nTelefones: ");
        for(String elemento: telefones) {
            sb.append("\n-").append(elemento);
        }
        sb.append("\nDisciplinas: ");
        for(String elemento: disciplinas) {
            sb.append("\n-").append(elemento);
        }

        return sb.toString();
    }

}
