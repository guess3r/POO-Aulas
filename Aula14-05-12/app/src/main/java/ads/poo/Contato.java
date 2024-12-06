package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, String data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        formatarData(data);
        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    boolean formatarData(String data){
        try {
            // Modificado para aceitar formato ddMMyyyy sem barras
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            this.nascimento = LocalDate.parse(data, formatter);  // Converte a String em LocalDate
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao formatar a data: " + e.getMessage());
            return false;
        }
    }

    public boolean addTelefone(String r, String v){
        telefones.add(new Telefone(r,v));
        return true;
    }

    public boolean addEmail(String r, String v){
        emails.add(new Email(r,v));
        return true;
    }

    public boolean removeTelefone(String r){
        return false;
    }

    public boolean removeEmail(String r){
        return false;
    }

    public boolean updateTelefone(String r, String n){
        return false;
    }

    public boolean updateEmail(String r, String e){
        return false;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = nascimento.format(formatter);

        StringBuilder sb = new StringBuilder();
        sb.append("Contato: \n");
        sb.append("\nNome: ").append(this.nome);
        sb.append("\nData de Nascimento:").append(dataFormatada);
        sb.append("\nTelefones:");
        for(Telefone elemento: telefones){
            sb.append("\n -").append(elemento);
        }
        sb.append("\nEmail:");
        for(Email elemento: emails){
            sb.append("\n -").append(elemento);
        }

        return sb.toString();
    }

}
