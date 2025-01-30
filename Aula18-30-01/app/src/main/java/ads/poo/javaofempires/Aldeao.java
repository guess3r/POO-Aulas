package ads.poo.javaofempires;

public class Aldeao extends Personagem{

    public Aldeao(double vida, double dano, double velocidade) {
        super(vida, dano, velocidade);
    }

    @Override
    public String atacar() {
        return "Atacando com a picareta";
    }

    @Override
    public String mover() {
        return "Andando na velocidade: " + this.velocidade;
    }
}
