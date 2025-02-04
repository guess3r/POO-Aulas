package ads.poo.exercicio1;

public abstract class Carro {

    protected double intencidade;
    protected String estado;
    protected String marca;
    protected String cor;
    protected String modelo;

    public Carro(double intencidade, String estado, String marca, String cor, String modelo) {
        this.intencidade = intencidade;
        this.estado = estado;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }
}
