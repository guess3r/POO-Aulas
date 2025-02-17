/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Random;
import java.util.Scanner;

public class App implements DrawListener {

    private Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.addListener(this);
    }

    public static void main(String[] args) {

        App app = new App();

    }

    @Override
    public void mousePressed(double x, double y) {
        Random a = new Random();
        int rgb = 255;
        int r = a.nextInt(rgb);
        int g = a.nextInt(rgb);
        int b = a.nextInt(rgb);
        draw.setPenColor(r,g,b);
        this.draw.filledCircle(x, y, 0.1);
    }

    @Override
    public void keyTyped(char c) {
        if (c == 'c') {
            this.draw.clear();
        }
    }
}
