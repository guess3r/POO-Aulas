package ads.poo;

public class Pessoa {

    // Atributos

    private String nome;
    private String cpf;
    private String sobrenome;

    // Método Construtor
    

    public Pessoa(String n, String sobrenome) {
        this(n);
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome, String cpf) {
        this(nome,sobrenome);
        this.cpf = cpf;
    }

    // Métodos

    







    public void definirNome(String n){
        this.nome = n;
    }

    public void definirCpf(String c){
        this.cpf = c;
    }

    public String obterNome(){
        return nome;
    }

    public String obterCpf(){
        return cpf;
    }

    
    
}
