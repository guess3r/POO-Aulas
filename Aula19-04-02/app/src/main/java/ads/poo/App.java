package ads.poo;

import ads.poo.javaOfEmpires.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Personagem> jogo = new ArrayList<>();

        jogo.add(new Aldeao(25,1,0.8));
        jogo.add(new Arqueiro(35,2,1));
        jogo.add(new Cavaleiro(50,3,2));

        for (Personagem p : jogo){
            System.out.println(((Guerreiro)p).atacar());
            System.out.println(p.mover());
        }
    }
}
