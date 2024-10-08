package ads.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //1, 5, 10, 25, 50 e 100
        int[] moedas = new int[6];
        String[] textoMoeda = {"0,01", "0,05", "0,10", "0,25", "0,50", "1,00"};
        int entrada = 0;
        double total = 0;
        do {
            System.out.print("Qual o valor da moeda: ");
            entrada = teclado.nextInt();
            switch (entrada) {
                case 1 -> {
                    moedas[0]++;
                    total++;
                }
                case 5 -> {
                    moedas[1]++;
                    total += 5;
                }
                case 10 -> {
                    moedas[2]++;
                    total += 10;
                }
                case 25 -> {
                    moedas[3]++;
                    total += 25;
                }
                case 50 -> {
                    moedas[4]++;
                    total += 50;
                }
                case 100 -> {
                    moedas[5]++;
                    total += 100;
                }
                default ->
                    System.out.println("Valor incorreto");
            }
        } while (entrada != 0);
        System.out.println(String.format("Você tem R$ %8.2f", (total / 100)));
        for (int i = 0; i < 6; i++) {
            String s = String.format("%3d moedas de %s", moedas[i], textoMoeda[i]);
            System.out.println(s);
        }
    }
}
