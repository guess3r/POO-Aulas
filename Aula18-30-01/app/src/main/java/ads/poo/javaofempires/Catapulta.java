package ads.poo.javaofempires;

public class Catapulta extends Personagem{
    public Catapulta(double vida, double dano, double velocidade) {
        super(vida, dano, velocidade);
    }

    @Override
    public String atacar() {
        return "Pedrada na cara dos otarios";
    }

    @Override
    public String mover() {
        return "Andando na velocidade: " + velocidade;
    }
}
