package ads.poo;

public class Carro {

    // private String modelo;
    private final int VELOCIDADE_MAXIMA = 200;
    // private String cor;
    // private double preco;
    private int velocidadeAtual;
    private final int VELOCIDADE_MINIMA = 0;

    public void definirVelocidade(int v) {
        velocidadeAtual = v;
    }

    public void acelerar(int a) {
        if (velocidadeAtual + a > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += a;
        }
    }

    public void frear(int f) {
        if (velocidadeAtual - f < VELOCIDADE_MINIMA) {
            velocidadeAtual = VELOCIDADE_MINIMA;
        } else {
            velocidadeAtual -= f;
        }
    }

    public int obterVelocidade() {
        return velocidadeAtual;
    }

}
