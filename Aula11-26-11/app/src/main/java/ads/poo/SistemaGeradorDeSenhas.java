package ads.poo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {

    private ArrayList<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas(){
        this.senhas = new ArrayList<>();
        this.contador = new AtomicInteger();
    }

    public void adicionarSenha(){
        LocalDateTime horario = LocalDateTime.now();
        Integer numero = contador.incrementAndGet();
    }

    public Senha chamarProximaSenha(){

    }

    public static void main(String[] args) {
        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        s.adicionarSenha(LocalDateTime.now());
        Senha a = s.chamarProximaSenha();
    }
}
