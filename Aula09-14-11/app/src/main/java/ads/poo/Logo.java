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

    Color verde = new Color(50,160,65);
    Color vermelho = new Color(200,25,30);

    //Construtor

    public Logo(double x, double y, double tamanho, boolean colorido) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.colorido = colorido;
    }


    //Metodos

    public void desenhar(Draw draw){

//        draw.setCanvasSize(600,300);
//        draw.setXscale(0,600);
//        draw.setYscale(0,300);

        if  (colorido == true){
            Color atual = draw.getPenColor();
            draw.setPenColor(verde);
            //Linha 1
            draw.filledRoundRectangle(x,y,tamanho,tamanho,15,15);
            draw.filledRoundRectangle(x*3,y,tamanho,tamanho,15,15);
            //Linha 2
            draw.filledRoundRectangle(x,y*3,tamanho,tamanho,15,15);
            draw.filledRoundRectangle(x*3,y*3,tamanho,tamanho,15,15);
            draw.filledRoundRectangle(x*5,y*3,tamanho,tamanho,15,15);
            //Linha 3
            draw.filledRoundRectangle(x,y*5,tamanho,tamanho,15,15);
            draw.filledRoundRectangle(x*3,y*5,tamanho,tamanho,15,15);
            //Linha 4
            draw.setPenColor(vermelho);
            draw.filledCircle(x,y*7,tamanho);
            draw.setPenColor(verde);
            draw.filledRoundRectangle(x*3,y*7,tamanho,tamanho,15,15);
            draw.filledRoundRectangle(x*5,y*7,tamanho,tamanho,15,15);

            draw.setPenColor(atual);
        }else{

        }

    }


}
