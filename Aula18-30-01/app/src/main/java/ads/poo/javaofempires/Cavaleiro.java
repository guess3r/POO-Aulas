package ads.poo.javaofempires;

public class Cavaleiro extends Personagem{

    public Cavaleiro(double vida, double dano, double velocidade) {
        super(vida, dano, velocidade);
    }

    @Override
    public String atacar() {
        return "Espadada neles";
    }

    @Override
    public String mover() {
        return "Andando na velocidade: " + velocidade;
    }
}
