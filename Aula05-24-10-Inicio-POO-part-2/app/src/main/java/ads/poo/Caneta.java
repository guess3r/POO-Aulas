package ads.poo;

public class Caneta {

    // Atributos: cor, nivel de tinta 

    private String cor;
    private double nivelTinta;

    // Métodos

    public void definirCor(String c){
        cor = c;
    }

    public void definirNivelTinta(double t){
        nivelTinta = t;
    }

    public String obterCor(){
        return cor;
    }

    public double obterNivelTinta() {
        return nivelTinta;

    }

    public String desenhar(double distancia){

        if (nivelTinta - distancia < 0){
            return "Nivel de tinta insuficiente!";
        }else {
            nivelTinta = this.nivelTinta - distancia;

            return"Desenhando " + distancia + "cm na cor " + cor + ".";
        }

    }

}