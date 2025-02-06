package ads.poo.exercicio1;

public class Leão extends Animal implements Rugir, Correr{
    public Leão(String nome) {
        super(nome);
    }

    @Override
    public String correr() {
        return "corre muito rápido";
    }

    @Override
    public String rugir() {
        return "rugi ferozmente";
    }

    @Override
    public String habilidade() {
        return correr() + " e " + rugir();
    }
}
