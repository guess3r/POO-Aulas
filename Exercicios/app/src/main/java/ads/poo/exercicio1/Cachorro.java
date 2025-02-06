package ads.poo.exercicio1;

public class Cachorro extends Animal implements Falar, Correr {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String correr() {
        return "corre rápido";
    }

    @Override
    public String fala() {
        return "late";
    }

    @Override
    public String habilidade() {
        return correr() + " e " + fala();
    }
}
