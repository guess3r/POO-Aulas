package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Circulo {

    //Atributos

    private double x;
    private double y;
    private double radius;
    private Color cor;

    //Construtor

    public Circulo(double x, double y, double radius, Color cor) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.cor = cor;
    }

    //Metodos

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void desenhar(Draw draw){
        Color atual = draw.getPenColor();
        draw.setPenColor(cor);
        draw.filledCircle(x,y,radius);
        draw.setPenColor(atual);
    }



}
