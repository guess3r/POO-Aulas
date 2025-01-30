package ads.poo.javaofempires;

public class Personagem {

    protected double vida;
    protected double dano;
    protected double velocidade;

    public Personagem(double vida, double dano, double velocidade) {
        this.vida = vida;
        this.dano = dano;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return "atacando " + dano;
    }

    public String mover(){
        return "andando, velocidade: " + velocidade;
    }
}
