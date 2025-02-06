package ads.poo.exercicio1;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String habilidade();

    @Override
    public String toString() {
        return nome + " é um " + this.getClass().getSimpleName();
    }}
