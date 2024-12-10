
package ads.poo;

import java.awt.*;
import java.util.Scanner;

public class App {

    private Agenda agenda = new Agenda();

    public boolean menu(Agenda a){
        Scanner teclado = new Scanner(System.in);

        while (true){

            System.out.println("\n..::Menu::..");
            System.out.println("1- Listar contatos");
            System.out.println("2. Adicionar contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Adicionar telefone ou e-mail");
            System.out.println("5. Remover telefone ou e-mail");
            System.out.println("6. Mudar telefone ou e-mail");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1: // Listar Contatos
                    System.out.println(agenda);
                    break;
                case 2: // Adicionar Contato
                    System.out.print("Digite o Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite o Sobrenome: ");
                    String sobrenome = teclado.nextLine();
                    System.out.print("Digite a data de nasimento (ddMMAAAA): ");
                    String data = teclado.nextLine();
                    agenda.addContato(nome,sobrenome,data);
                    break;
                case 3: // Remover Contato
                    System.out.print("Digite o Nome: ");
                    nome = teclado.nextLine();
                    System.out.print("Digite o Sobrenome: ");
                    sobrenome = teclado.nextLine();
                    if (agenda.removeContato(nome, sobrenome)) {
                        System.out.print("Contato removido com sucesso.");
                    } else {
                        System.out.print("Contato não encontrado.");
                    }
                    break;
                case 4: // Adicionar Telefone ou Email
                    System.out.print("Digite o nome do contato: ");
                    nome = teclado.nextLine();
                    System.out.print("Digite o sobrenome do contato: ");
                    sobrenome = teclado.nextLine();

                    System.out.println("Digite o rótulo: ");
                    String rotulo = teclado.nextLine();
                    System.out.println("Digite o valor: ");
                    String valor = teclado.nextLine();
                    if (valor.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$") == true){
                        agenda.addEmail(rotulo,valor,agenda.getContato(nome,sobrenome));
                        System.out.println("E-mail adicionado com suceesso!");
                    }else if (valor.length() == 11){
                        agenda.addTelefone(rotulo,valor,agenda.getContato(nome,sobrenome));
                        System.out.println("Telefone adicionado com suceesso!");
                    }else {
                        System.out.println("Erro ao adicionar, tente novamente.");
                    }
                    break;
                case 5: // Remover Telefone ou Email
                    System.out.print("Digite o nome do contato: ");
                    nome = teclado.nextLine();
                    System.out.print("Digite o sobrenome do contato: ");
                    sobrenome = teclado.nextLine();
                    System.out.println("Digite o valor do E-mail ou Telefone que deseja remover: ");
                    valor = teclado.nextLine();
                    if (valor.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$") == true){
                        agenda.removeEmail(valor,agenda.getContato(nome,sobrenome));
                        System.out.println("E-mail removido com suceesso!");
                    }else if (valor.length() == 11){
                        agenda.removeTelefone(valor,agenda.getContato(nome,sobrenome));
                        System.out.println("Telefone removido com suceesso!");
                    }else {
                        System.out.println("Erro ao remover, tente novamente.");
                    }
                    break;
                case 6: // Mudar Telefone ou Email
                    System.out.println("Deseja alterar o telefone ou o e-mail?");
                    String tipo = teclado.nextLine().toLowerCase();

                    System.out.print("Digite o nome do contato: ");
                    nome = teclado.nextLine();
                    System.out.print("Digite o sobrenome do contato: ");
                    sobrenome = teclado.nextLine();
                    if (agenda.getContato(nome,sobrenome) == null) {
                        System.out.println("Contato não encontrado.");
                        break;
                    }

                    if (tipo.equals("telefone")){
                        System.out.println("Digite o rotulo que deseja mudar: ");
                        rotulo = teclado.nextLine();
                        System.out.println("Digite o novo valor do telefone: ");
                        valor = teclado.nextLine();
                        boolean atualizado = agenda.updateTelefone(rotulo, valor, agenda.getContato(nome,sobrenome));
                        if (atualizado) {
                            System.out.println("Telefone alterado com sucesso!");
                        } else {
                            System.out.println("Erro ao alterar o telefone. Verifique se o rótulo está correto.");
                        }
                    } else if (tipo.equals("email")) {
                        System.out.print("Digite o rotulo que deseja mudar: ");
                        rotulo = teclado.nextLine();
                        System.out.print("Digite o novo valor do email: ");
                        valor = teclado.nextLine();
                        boolean atualizado = agenda.updateEmail(rotulo, valor, agenda.getContato(nome,sobrenome));
                        if (atualizado) {
                            System.out.println("E-mail alterado com sucesso!");
                        } else {
                            System.out.println("Erro ao alterar o e-mail. Verifique se o rótulo está correto.");
                        }
                    }
                    break;
                case 7: // Sair do Menu
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void main(String[] args) {

//        Contato c = new Contato("João","Guesser","05012004");
//        c.addTelefone("Pessoal","48999980728");
//        System.out.println(c);
//        c.removeTelefone("Pessoal");
//        System.out.println(c);
//        c.addEmail("Pessoal","joaogg2004@aluno.ifsc.edu.br");
//        System.out.println(c);

    }

}
