package prova;

import java.util.Random;
import java.util.Scanner;

public class prova_at03 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int bateria;
        bateria = rd.nextInt(100);
        int opcao;
        int pilha = 2;
        int tempoC = 2500;
        int tempoMC = 1500;

        System.out.println("\n====CORREDOR====");
        System.out.println("Você é um caçador de lendas junto com seus amigos, vocês estavam andando por um predio em ruinas abandonado");
        Thread.sleep(tempoC);
        System.out.println("Tudo estava relativamente tranquilo até que você tropeça e acaba caindo em um buraco");
        Thread.sleep(tempoC);
        System.out.println("\nAmigo1:'JOHN CUIDADO!!!'");
        Thread.sleep(tempoMC);
        System.out.println("Amigo2:'BRO DOE NÃÃÃÃÃÃO'");
        Thread.sleep(tempoC);
        System.out.println("\nVocê cai de uma altura consideravel, sente que se debateu de um lado para o outro, e acabou em um tipo de corredor escuro...");
        System.out.println("Você não consegue mais ver nem ouvir seus amigos, e sabe que deve sair daqui...");
        System.out.println("Mas tem um problema, sua lanterna está com pouca bateria, e por algum motivo você sente como se o escuro te consumisse... ");
        Thread.sleep(tempoC);
        System.out.println("Voce deve caminhar pelo maior tempo possivel no corredor para tentar escapar, se sua lanterna acabar a bateria, a escuridão te consumira");

        while (bateria > 0) {
            System.out.println("\nbateria atual:" + bateria + "%");
            System.out.println("oque voce deseja fazer: ");
            System.out.println("\n1: caminhar (-20%)");
            System.out.println("2: trocar pilhas (+40%)");

            System.out.println("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você caminhou pelo corredor escuro, sendo minimamente iluminado pela fraca luz de sua lanterna, que não ira durar muito mais... (-20%)");
                    bateria -= 20;
                    break;

                case 2:
                    if (pilha > 0) {
                    System.out.println("com medo de ficar na escuridão, você resolve trocar as pilhas de sua lanterna, mas cuidado, elas não são infinitas... (+40%)");   
                        bateria += 40;
                        pilha--;
                    }else if(pilha < 1) {
                        System.out.println("suas pilhas acabaram... seu tempo agora está contado...");
                    }

                    if (bateria > 100) {
                        bateria = 100;
                    }
                    
                    break;

                default:
                    System.out.println("você apenas ficou parado sem tentar sair deste corredor (-5%)");
                    bateria += (-5);
                    break;
            }
        }
        System.out.println("sua bateria não foi o suficiente para sair do corredor, talves ele nem tivesse uma saída... ao menos você teve alguma cahnce? acho que essas são perguntas que não terão respostas");
        System.out.println("A escuridão... vem até você, ela o consome, mas não como algo normal, mas como algo vive, que usara seu medo e seu pavor para se alimentar");
        System.out.println("VoCê NãO dEvErIa TeR vInDo AqUi!!!");
        System.out.println("\nvocê foi consumido.");

    }
}
