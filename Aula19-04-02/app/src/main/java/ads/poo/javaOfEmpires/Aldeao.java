package ads.poo.javaOfEmpires;

public class Aldeao extends Personagem implements Guerreiro, Coletador  {
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

    @Override
    public String coletarMadeira() {
        return "Aldeão Coltetando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletando ouro";
    }
}
