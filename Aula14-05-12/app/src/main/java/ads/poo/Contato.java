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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            this.nascimento = LocalDate.parse(data, formatter);
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao formatar a data: " + e.getMessage());
            return false;
        }
    }

    public boolean addTelefone(String r, String v){
        Telefone novoTelefone = new Telefone(r, v);
        if (novoTelefone.getValor().equals("invalido")) {
            System.out.println("Telefone inválido!");
            return false;
        }
        if (telefones.stream().anyMatch(t -> t.getValor().equals(novoTelefone.getValor()))) {
            System.out.println("Telefone duplicado!");
            return false;
        }
        telefones.add(novoTelefone);
        return true;
    }

    public boolean addEmail(String r, String v){
        Email novoEmail = new Email(r, v);

        if (novoEmail.toString().endsWith(": ")) {
            System.out.println("E-mail inválido: " + v);
            return false;
        }

        if (emails.stream().anyMatch(e -> e.toString().equals(novoEmail.toString()))) {
            System.out.println("E-mail duplicado: " + v);
            return false;
        }

        emails.add(novoEmail);
        return true;
    }

    public boolean removeTelefone(String r){
        return telefones.removeIf(telefone -> telefone.getRotulo().equals(r));
    }

    public boolean removeEmail(String r){
        return emails.removeIf(email -> email.getRotulo().equals(r));
    }

    public boolean updateTelefone(String r, String n){
        for (Telefone telefone : telefones) {
            if (telefone.toString().startsWith(r + ":")) {
                if (telefone.setTelefone(n)) {
                    return true;
                } else {
                    System.out.println("Número de telefone inválido: " + n);
                    return false;
                }
            }
        }
        System.out.println("Telefone com rótulo '" + r + "' não encontrado.");
        return false;
    }

    public boolean updateEmail(String r, String e){
        for (Email email : emails) {
            if (email.toString().startsWith(r + ":")) {
                String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
                if (e.matches(eR)) {
                    email.setValor(e);
                    return true;
                } else {
                    System.out.println("E-mail inválido: " + e);
                    return false;
                }
            }
        }
        System.out.println("E-mail com rótulo '" + r + "' não encontrado.");
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = nascimento.format(formatter);

        StringBuilder sb = new StringBuilder();
        sb.append("-Contato: \n");
        sb.append(" -Nome: ").append(this.nome).append(" ").append(this.sobrenome);
        sb.append("\n -Data de Nascimento:").append(dataFormatada);
        sb.append("\n -Telefones:");
        for(Telefone elemento: telefones){
            sb.append("\n ").append(elemento);
        }
        sb.append("\n -Email:");
        for(Email elemento: emails){
            sb.append("\n ").append(elemento);
        }

        return sb.toString();
    }

}
