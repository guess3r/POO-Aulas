/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        Telefone t = new Telefone(123,"345","Preto",45,new Dimensao(5,5,5));
        SemFio s = new SemFio(126,"348","vermelho",45,new Dimensao(5,5,5),5,5,5);

        System.out.println(t.imprimirDados());
        System.out.println(s.imprimirDados());
    }
}
