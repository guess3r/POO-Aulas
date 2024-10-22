package ads.poo;


public class App {

    public static void main(String[] args) {
        
        // Criando o primeiro objeto, urrull
        Carro fusca = new Carro();

        fusca.definirModelo("Fusca");
        fusca.definirCor("azul");

        // Defini o método utilizado no objeto fusca
        fusca.definirVelocidade(10);

        // Imprimir na tela a velocidade do fusca
        System.out.println(fusca.obterModelo() +" " + fusca.obterCor() + " está " + fusca.obterVelocidade() + " Km/h");


        Carro gol = new Carro();

        gol.definirModelo("Gol");
        gol.definirCor("verde");
        gol.definirVelocidade(30);

        System.out.println(gol.obterModelo() + " " + gol.obterCor() + " está " + gol.obterVelocidade() + " Km/h");


        // Cada objeto tem seu armazenamento, e o valor inicial definido para velocidade é de 0, ou seja, a velocidade atual da ferrari será 0

        Carro ferrari = new Carro();
        System.out.println(ferrari.obterVelocidade());

    }

}
