package ads.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(String nome, String sobrenome, String data) {
        Contato novoContato = new Contato(nome,sobrenome,data);
        contatos.add(novoContato);
        return true;
    }

    public boolean removeContato(String nome, String sobrenome) {
        return contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome) && c.getSobrenome().equalsIgnoreCase(sobrenome));
    }

    public boolean addTelefone(String rotulo, String numero, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.addTelefone(rotulo, numero);
        }
        return false;
    }

    public boolean addEmail(String rotulo, String email, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.addEmail(rotulo, email);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String numero, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.updateTelefone(rotulo, numero);
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.updateEmail(rotulo, email);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.removeTelefone(rotulo);
        }
        return false;
    }

    public boolean removeEmail(String rotulo, Contato c) {
        if (c != null && contatos.contains(c)) {
            return c.removeEmail(rotulo);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Agenda:\n");
        for (Contato contato : contatos) {
            sb.append(contato).append("\n");
        }
        return sb.toString();
    }
}
