package ads.poo;

public abstract class Veiculo {

    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMax;

    public Veiculo(int id, int velocidadeAtual, int velocidadeMax) {
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMax = velocidadeMax;
    }

    abstract int acelerar(int i);

    abstract  int frear(int i);

}

