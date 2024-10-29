package ads.poo;

public class Pessoa {

    // Atributos

    private String nome;
    private String cpf;

    // Método Construtor

    public Pessoa(String n, String c){
        nome = n;
        cpf = c;
    }

    public Pessoa(){
        
    }

    // Métodos

    public void definirNome(String n){
        nome = n;
    }

    public void definirCpf(String c){
        cpf = c;
    }

    public String obterNome(){
        return nome;
    }

    public String obterCpf(){
        return cpf;
    }

    
    
}
