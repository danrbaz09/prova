
package prova;
import java.util.HashSet;
import java.util.Scanner;
public class prova_at04 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        HashSet<String> jogos = new HashSet<>();
        int opcao;
        int tempo = 2500;
        do{
            System.out.println("=== THE GAME AWARDS ===");
            System.out.println("1- indicar jogo\n2- ver lista\n3- encerrar");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do jogo que quer indicar");
                    String jogo = sc.nextLine().toLowerCase();
                    
                    if(jogos.add(jogo)){
                        System.out.println("Jogo adicionado com sucesso!!\n");
                        Thread.sleep(tempo);
                    }else{
                        System.out.println("ERRO: jogo ja adicionado!!");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n=== LISTA DE JOGOS ===");
                    for(String nome : jogos){
                        System.out.println(nome);
                    }
                    break;
                    
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (opcao != 0);
       
    }
   
}
