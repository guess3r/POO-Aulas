package ads.poo;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Aluno j = new Aluno("Guesser",123456789,new String[]{"Mar", "Orde"});




















        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(10);
        numeros.add(5);

//        Não recomendado para coleções
//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(numeros.get(i));
//        }


        //Formas de imprimir:

        //for each tradicional
        for (Integer elementos : numeros){
            System.out.println(elementos);
        }

        //lambda
        numeros.forEach(e-> System.out.println(e));

        //method reference
        numeros.forEach(System.out::println);

        //remover
        //numeros.removeIf(e->e ==10);


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Guesser");
        nomes.add("Lele");
        nomes.add("Bean");

        //remover
        //nomes.removeIf(e->e.equals("Lele"));

        //ordernar
        Collections.sort(numeros);

        //embaralhar
        Collections.shuffle(nomes);

        numeros.forEach(e-> System.out.println(e));

        nomes.forEach(e-> System.out.println(e));


        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Ana");


        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Juca");

        String n = fila.poll(); // retorna null se a fila estiver vazia

    }
}
