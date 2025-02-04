package ads.poo.javaOfEmpires;

public abstract class Personagem {
    protected double vida;
    protected double dano;
    protected double velocidade;

    public Personagem(double vida, double dano, double velocidade) {
        this.vida = vida;
        this.dano = dano;
        this.velocidade = velocidade;
    }

    public abstract String mover();
}
