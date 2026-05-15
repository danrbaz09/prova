
package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class prova_at07 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EQUIPAMENTOS DO ANÃO BARTÔ ===");
        System.out.println("Olá jovem aventureiro, vejo que tem o desejo de explorar terras perigosas, em busca de gloria e riquezas");
        System.out.println("mas para isso jovem aventureiro, você deve se equipar de forma correta");
        System.out.println("\nFique avontade para dar uma boa olhada em minha loja...");
        System.out.println("MASSS, antes de tudo pegue estes itens que todos os iniciantes tem de direito");
        System.out.println("*itens adiquiridos*\n[Espada]\n[Armadura]\n[Botas]");

        String[] corpo = {"Espada\n", "Armadura\n", "Botas\n"};

        ArrayList<String> bau = new ArrayList<>();

        bau.add("Anel");
        bau.add("Escudo");
        bau.add("Capacete");
        int tempo = 2500;
        int opcao;
       
        do {
             Thread.sleep(tempo);
            System.out.println("\n=== EQUIPAMENTOS DO BARTO ===");
            System.out.println("1 - Ver itens equipados");
            System.out.println("2 - Equipar item do baú");
            System.out.println("0 - Sair");
            System.out.println("\nEscolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\nItens equipados:\n");

                    for (String item : corpo) {
                        System.out.println(item);
                    }

                    break;

                case 2:

                    System.out.println("\nItens no baú:");

                    for (String item : bau) {
                        System.out.println(item);
                    }

                    System.out.print("Digite o item para equipar: ");
                    String itemEscolhido = sc.nextLine();

                    if (bau.contains(itemEscolhido)) {

                        corpo[0] += itemEscolhido;
                        bau.remove(itemEscolhido);

                        System.out.println("Item equipado!");
                    } else {
                        System.out.println("Item não encontrado no baú!");
                    }

                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        }
        
    }


