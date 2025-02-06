package ads.poo.exercicio1;

public class Pinguim extends Animal implements Nadar, Correr{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return nadar() + " e " + correr();
    }

    @Override
    public String correr() {
        return "anda de forma razoável";
    }

    @Override
    public String nadar() {
        return "nada muito rápido";
    }
}
