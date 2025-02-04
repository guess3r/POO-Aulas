package ads.poo.javaOfEmpires;

public class Arqueiro extends Personagem implements Guerreiro {
    public Arqueiro(double vida, double dano, double velocidade) {
        super(vida, dano, velocidade);
    }

    @Override
    public String atacar() {
        return "Disparando flechas";
    }

    @Override
    public String mover() {
        return "Andando na velocidade: " + velocidade;
    }
}
