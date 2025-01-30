package ads.poo;

import ads.poo.javaofempires.*;
import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

import java.util.ArrayList;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

        ArrayList<Personagem> jogo = new ArrayList<>();

        jogo.add(new Aldeao(25,1,0.8));
        jogo.add(new Arqueiro(35,2,1));
        jogo.add(new Cavaleiro(50,3,2));
        jogo.add(new Catapulta(75,5,0.3));

        for (Personagem per : jogo){
            System.out.println(per.atacar());
            System.out.println(per.mover());
        }

//        ArrayList<Telefone> produtos = new ArrayList<>();
//
//        produtos.add(new Telefone(123,"345","Preto",45,new Dimensao(5,5,5)));
//        produtos.add(new SemFio(126,"348","vermelho",45,new Dimensao(5,5,5),5,5,5));
//
//        for (Telefone tel : produtos){
//            if (tel instanceof SemFio) {
//            System.out.println(((SemFio) tel).trocarCanal());
//            }else
//                // polimorfismo
//                System.out.println(tel.imprimirDados());
//        }



//        System.out.println(t.imprimirDados());
//        System.out.println(s.imprimirDados());

//        SemFio a;
//        Telefone b;
//
//        b = t;
//
//        if (b instanceof SemFio) {
//            System.out.println(((SemFio) b).trocarCanal());
//        }else {
//            System.out.println("não é semfio");
//        }
    }
}