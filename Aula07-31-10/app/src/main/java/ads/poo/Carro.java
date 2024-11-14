package ads.poo;

public class Carro {

    private String modelo;
    private final int VELOCIDADE_MAX;
    private int velocidadeAtual;


    public Carro(String modelo, int velocidade_max, int velocidadeAtual) {

        this.modelo = modelo;
        this.velocidadeAtual = 0;
        VELOCIDADE_MAX = velocidade_max;
        this.acelerar(velocidadeAtual);
    }


    public void definirVelocidade(int v) {
        velocidadeAtual = v;
    }

    public void acelerar(int a) {
        this.velocidadeAtual = Math.max(Math.min(VELOCIDADE_MAX, this.velocidadeAtual + a), 0);
    }

    public void frear(int f) {
        if (velocidadeAtual - f < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= f;
        }
    }

    public int obterVelocidade() {
        return velocidadeAtual;
    }

}
