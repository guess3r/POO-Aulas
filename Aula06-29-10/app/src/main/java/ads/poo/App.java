package ads.poo;

public class App {
    public static void main(String[] args) {

        // Interface com usuario
        
        // Carro c = new Carro();

        // System.out.println(c.obterVelocidade());

        // c.acelerar(100);
        // System.out.println(c.obterVelocidade());
        // c.acelerar(50);
        // System.out.println(c.obterVelocidade());
        // c.acelerar(150);
        // System.out.println(c.obterVelocidade());

        // c.frear(100);
        // System.out.println(c.obterVelocidade());
        // c.frear(50);
        // System.out.println(c.obterVelocidade());
        // c.frear(150);
        // System.out.println(c.obterVelocidade());



        Pessoa p = new Pessoa("Carla", "102.123.432-12");
        Pessoa a = new Pessoa("Jorge", "432.125.234-46");

        System.out.println("Nome: " + p.obterNome());
        System.out.println("Cpf: " + p.obterCpf());

        System.out.println("Nome: "+a.obterNome());
        System.out.println("Cpf: " + a.obterCpf());


    }
}
