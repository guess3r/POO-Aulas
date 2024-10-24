package ads.poo;

public class Carro {
    
    // Atributos:
    private String modelo;
    private int velocidadeAtual;
    private String cor;

    public void definirModelo(String m){
        modelo = m;
    }

    public void definirCor(String c){
        cor = c;
    }

    // Métodos:
    public void definirVelocidade(int v){
        velocidadeAtual = v;
    }

    public int obterVelocidade(){
        return velocidadeAtual;
    }

    public String obterCor(){
        return cor;
    }

    public String obterModelo(){
        return modelo;
    }

}
