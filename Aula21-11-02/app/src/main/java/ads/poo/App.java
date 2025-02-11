 package ads.poo;

 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Collections;
 import java.util.List;

 public class App {
    public static void main(String[] args) {

        List<Carta> baralho = new ArrayList<>();

        for (Naipe naipe : Naipe.values()){
            for (Valor valor : Valor.values()){
                baralho.add(new Carta(naipe, valor));
            }
        }

        for (Carta c : baralho){
            System.out.println(c);
        }
        Collections.shuffle(baralho);
        for (Carta c : baralho){
            System.out.println(c);
        }


        // Enumerações
//        DiaDaSemana[] aulas = {DiaDaSemana.TER, DiaDaSemana.QUI};
//
//        int disco = aulas[0].codigo;
//
//        DiaDaSemana relatorio = DiaDaSemana.getByCodigo(disco);
//
//        if (relatorio != null){
//            System.out.println(relatorio);
//        }
//
//        switch (relatorio){
//            case DOM -> System.out.println("não tem aula");
//            case SAB -> System.out.println("alguns tem aula");
//            default -> System.out.println("pode ter aula");
//        }
//
//        for (DiaDaSemana d : aulas){
//            System.out.println(d);
//        }

//        Planeta[] sistemaSolar = {Planeta.Mer,Planeta.Ven};
//
//        for (Planeta p : sistemaSolar){
//            System.out.println(p);
//        }

    }
}
