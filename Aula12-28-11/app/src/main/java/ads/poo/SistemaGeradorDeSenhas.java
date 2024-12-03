package ads.poo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {

    private Queue<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas() {
        this.senhas = new LinkedList<>();
        this.contador = new AtomicInteger();
    }

    public void adicionarSenha(){
        LocalDateTime horario = LocalDateTime.now();
        Integer numero = contador.incrementAndGet();

        Senha s = new Senha(numero, false, "conta", horario);
        this.senhas.add(s);
    }

    public Senha chamarProximaSenha(){
        return this.senhas.poll();
        //first in first out
    }

    public static void main(String[] args) {

        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        s.adicionarSenha();
        Senha a = s.chamarProximaSenha();
        System.out.println(a);
    }

}