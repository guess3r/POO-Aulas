
package ads.poo;

public class App {
    public static void main(String[] args) {
        Telefone p = new Telefone("Residencial","48998765432");
        System.out.println(p);
        Email m = new Email("Pessoal","meu.email@dominio.com.br");
        System.out.println(m);
        Email n = new Email("Trabalho","joao.gg");
        System.out.println(n);

        Contato c = new Contato("João","Guesser","05012004");
        c.addTelefone("Residencial","48998765432");
        c.addEmail("Pessoal","meu.email@dominio.com.br");
        System.out.println(c);



    }
}
