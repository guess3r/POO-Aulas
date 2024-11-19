package ads.poo;

// DESENHAR LOGO DO IFSC
// Primeira linha: circulo quadrado quadrado
// Segunda: quadrado quadrado
// Terceira: quadrado quadrado quadrado
// Quarta: quadrado quadrado

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Logo {

    //Atributos

    private double x;
    private double y;
    private double tamanho;
    private boolean colorido;

    Color verde = new Color(50, 160, 65);
    Color vermelho = new Color(200, 25, 30);
    Color cinzaEscuro = new Color(46,46,46);
    Color cinza = new Color(80,80,80);

    //Construtor

    public Logo(double x, double y, double tamanho, boolean colorido) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.colorido = colorido;
    }


    //Metodos

    public void desenhar(Draw draw) {
        if(colorido == true) {
            draw.setPenColor(verde);
        }else {draw.setPenColor(cinza);}
        //Linha 1
        draw.filledRoundRectangle(x, y, tamanho, tamanho, 15, 15);
        draw.filledRoundRectangle(x * 3, y, tamanho, tamanho, 15, 15);
        //Linha 2
        draw.filledRoundRectangle(x, y * 3, tamanho, tamanho, 15, 15);
        draw.filledRoundRectangle(x * 3, y * 3, tamanho, tamanho, 15, 15);
        draw.filledRoundRectangle(x * 5, y * 3, tamanho, tamanho, 15, 15);
        //Linha 3
        draw.filledRoundRectangle(x, y * 5, tamanho, tamanho, 15, 15);
        draw.filledRoundRectangle(x * 3, y * 5, tamanho, tamanho, 15, 15);
        //Linha 4
        draw.filledRoundRectangle(x * 3, y * 7, tamanho, tamanho, 15, 15);
        draw.filledRoundRectangle(x * 5, y * 7, tamanho, tamanho, 15, 15);
        if(colorido == true) {
            draw.setPenColor(vermelho);
        }else {draw.setPenColor(cinzaEscuro);}
        draw.filledCircle(x, y * 7, tamanho);

    }


}
