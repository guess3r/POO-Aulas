package ads.poo.exercicio1;

public class Gato extends Animal implements Correr, Falar {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String correr() {
        return "corre agilmente";
    }

    @Override
    public String fala() {
        return "mia";
    }

    @Override
    public String habilidade() {
        return correr() + " e " + fala();
    }
}
