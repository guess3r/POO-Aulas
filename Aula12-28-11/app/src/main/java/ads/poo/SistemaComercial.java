package ads.poo;

import java.util.HashMap;

public class SistemaComercial {

    private HashMap<String, Cliente> clientes;
    //hash map acha oq vc quer com uma unica operaçao por uma chave, definir key, value

    public SistemaComercial() {
        this.clientes = new HashMap<>();
    }

    public boolean adicionarClientes(Cliente c) {
        if (this.clientes.get(c.getCpf()) == null) {;
            this.clientes.put(c.getCpf(), c);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String cpf) {
        return this.clientes.get(cpf);
    }

    public static void main(String[] args) {

        SistemaComercial s = new SistemaComercial();
        Cliente a = new Cliente("Beatriz", "123", "321");
        Cliente b = new Cliente("Leticia", "456", "654");
        Cliente c = new Cliente ("Isabella", "789", "987");
        s.adicionarClientes(a);
        s.adicionarClientes(b);
        s.adicionarClientes(c);
        System.out.println(s.buscarCliente("123"));

        //add 3, buscar um e imprimir na tela
    }
}