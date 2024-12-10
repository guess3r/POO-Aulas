
package ads.poo;

import java.awt.*;
import java.util.Scanner;

public class App {

    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true){

            System.out.println("\nMenu:");
            System.out.println("1. Listar contatos");
            System.out.println("2. Adicionar contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Adicionar telefone ou e-mail");
            System.out.println("5. Remover telefone ou e-mail");
            System.out.println("6. Mudar telefone ou e-mail");
            System.out.println("7. Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1: // Listar Contatos
                    System.out.println(agenda);
                    break;
                case 2: // Adicionar Contato
                    System.out.println("Digite o Nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o Sobrenome: ");
                    String sobrenome = teclado.nextLine();
                    System.out.println("Digite a data de nasimento (dd/MM/AAAA): ");
                    String data = teclado.nextLine();
                    agenda.addContato(nome,sobrenome,data);
                    break;
                case 3: // Remover Contato
                    System.out.println("Digite o Nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Digite o Sobrenome: ");
                    sobrenome = teclado.nextLine();
                    if (agenda.removeContato(nome, sobrenome)) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4: // Adicionar Telefone ou Email
                    System.out.println("Digite o rótulo: ");
                    String rotulo = teclado.nextLine();
                    System.out.println("Digite o valor: ");
                    String valor = teclado.nextLine();
                    System.out.print("Digite o nome do contato: ");
                    nome = teclado.nextLine();
                    System.out.print("Digite o sobrenome do contato: ");
                    sobrenome = teclado.nextLine();
                    String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
                    if (valor.matches(eR) == true){
                        agenda.addEmail(rotulo,valor,agenda.getContato(nome,sobrenome));
                        System.out.println("E-mail adicionado com suceesso!");
                    }
                case 5: // Remover Telefone ou Email
                case 6: // Mudar Telefone ou Email
                case 7: // Sair do Menu
                default: break;
            }
        }



    }


    public static void main(String[] args) {
        Menu menu = new Menu();

    }
}
