package ads.poo.exercicio1;

public class Arara extends Animal implements Voar, Falar{
    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return voar() + " e " + fala();
    }

    @Override
    public String fala() {
        return "imita palavras";
    }

    @Override
    public String voar() {
        return "voa muito alto";
    }
}
