package prova;

import java.util.Scanner;

public class prova_at01 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int tempo1 = 2500;
        int tempoC = 1000;
        System.out.println("FUGA DO ASSSASSINO");
        System.out.println("Você está caminhando por um acampamento à noite, apenas relaxando, mas ouve passos atras de voce...\nQuando você olha para trás vê um homem mascarado, ele percebe sua presença...\nE sem mais nem menos ele puxa um machado e começa a corre atrás de você");
        Thread.sleep(tempo1);
        System.out.println("Oque você fará nesta situação?");
        Thread.sleep(tempo1);
        System.out.println("\n1:correr para a floresta\n2:correr para a saída do acampamento\n3:Aceitar sua morte");
        System.out.println("\nEscolha: ");
        int escolha1 = sc.nextInt();
        Thread.sleep(tempo1);
        switch (escolha1) {
            case 1:
                System.out.println("Ao correr para a floresta escura e densa, você se vê perdido, sem um caminho nem destino certo...");
                System.out.println("Correndo só pensando que deseja salvar sua vida e não quer morrer neste lugar...");
                Thread.sleep(tempo1);
                System.out.println("Até que você se depara com uma bifurcação, sem muito tempo para pensar para qual lado você vai");
                System.out.println("1:Esquerda");
                System.out.println("2:Direita");
                System.out.println("\nEscolha: ");
                int escolhaL = sc.nextInt();

                if (escolhaL == 1) {
                    System.out.println("Você faz sua escolha e vira a esquerda sem nem pensar muito, então corre por longos segundos por aquele caminho escuro e amedrontador...");
                    Thread.sleep(tempo1);
                    System.out.println("Após correr um tempo você finalmente chega em algum lugar, uma cabana na beira do lago, com uma de suas maiores salvaçoes neste momento, um barco a motor...");
                    Thread.sleep(tempoC);
                    System.out.println("Você corre até o barco com o objetivo de só vazar deste lugar, mas ao chegar nele percebe que o barco está com alguns problemas, mas nada que não possa ser resolvido");
                    System.out.println("Você sabe que o ASSASSINO MASCARADO está vindo, então sabe que o tempo é curto...");
                    Thread.sleep(tempoC);
                    System.out.println("Então uma escolha deve ser tomada...");
                    System.out.println("1:Consertar o barco\n2:se esconder na cabana");
                    System.out.println("\nEscolha: ");
                    int escolhaB = sc.nextInt();

                    if (escolhaB == 1) {
                        System.out.println("ele está vindo, seja rápido...");
                        int progresso = 0;
                        int fugaB = 0;
                        do {

                            for (int i = 0; progresso < 100; i++) {
                                progresso += 25;
                                fugaB += progresso;
                                Thread.sleep(tempo1);
                                System.out.println("preparando barco...");
                                System.out.println("Progresso em " + progresso + "%");
                            }
                        } while (fugaB == 100);
                        System.out.println("*Barco Pronto*");
                        System.out.println("sem nem pensar mais você solta o barco da ponte e acelera com tudo se afastando do acampamento");
                        System.out.println("Você conseguiu... com muito esforço você olha para tras e vê o ASSASSINO MASCARADO olhando para você da beira do lago, enquanto você consegue relaxar pois conseguiu sobreviver...");
                        System.out.println("FINAL BOM 1 *conquistado*");
                        break;
                    } else if (escolhaB == 2){
                    System.out.println("No desespero você se esconde na cabana");
                    System.out.println("Você começa a ouvir os passos DELE se aproximando lentamente...");
                    System.out.println("Ouve a respiração dele chegando perto");
                    Thread.sleep(tempo1);
                    System.out.println("até que ela começa a se afastar, o tranquilizando... \nmas um outro som o deixa sem chão, o som do motor do barco sendo destruido, agora você não tem mais como escapar, não mais...");
                    System.out.println("FINAL NEUTRO *conquistado*");
                    
                    }else{
                    System.out.println("você não tem tempo para pensar demais, ELE te alcançou...");
                    System.out.println("SHLUCK!!!");
                    System.out.println("FINAL RUIM: INDECISO *conquistado*");  
                    }
                    break;

                } else if (escolhaL == 2) {
                    System.out.println("Você faz sua escolha e vira a direita sem nem pensar muito... mas... essa não foi a melhor escolha que você ja teve");
                    System.out.println("Por conta da elforia, seus olhos não percebem uma armadilha de urso logo a sua frente, uma armadilha que você caiu");
                    System.out.println("seu pé é preso, a dor é insuportavel, os dentes de aço esmagando seu tornozelo");
                    System.out.println("essa definitivamente é a pior escolha que você ja tomou na sua vida... mas não se preocupe");
                    System.out.println("essa será a sua ultima escolha em sua vida...");
                    Thread.sleep(tempo1);
                    System.out.println("ELE...");
                    Thread.sleep(tempo1);
                    System.out.println("tá...");
                    Thread.sleep(tempo1);
                    System.out.println("atrás de você...");
                    Thread.sleep(tempo1);
                    System.out.println("SHLUCK!!!");
                    System.out.println("Você morreu");
                    Thread.sleep(tempo1);
                    System.out.println("FINAL RUIM ARMADILHA *conquistado*");
                } else {
                    System.out.println("você não tem tempo para pensar demais, ELE te alcançou...");
                    System.out.println("SHLUCK!!!");
                    System.out.println("FINAL RUIM: INDECISO *conquistado*");
                }
                break;

            case 2:
                System.out.println("Você corre para a saída do acampamento com toda a força que você tem nas pernas");
                System.out.println("Chegando lá você vê o carro de um instrutor do acampamento, se quiser sobreviver, um crime deve ser cometido...");
                System.out.println("Qual será sua escolha: \n1:Roubar o carro e meter o pé\n2:Sair correndo na pernada");
                int escolhaS = sc.nextInt();
                if (escolhaS == 1) {
                    System.out.println("quando você entra no carro percebe que ele está sem gasolina... mas ainda tem uma chance, então você olha no porta-malas e acha um galão de gasolina reserva");
                    System.out.println("sem pensar duas veses você começa a encher o tanque de gasolina, mas deve ser rapido, pois ELE está vindo...");
                    int progressoG = 0;
                    int fugaC = 0;
                    do {

                        for (int i = 0; progressoG < 100; i++) {
                            progressoG += 25;
                            fugaC += progressoG;
                            Thread.sleep(tempo1);
                            System.out.println("coocando a gasolina...");
                            System.out.println("Progresso em " + progressoG + "%");
                        }
                    } while (fugaC == 100);
                    System.out.println("*Tanque cheio*");
                    System.out.println("Você entra no carro o mais rapido possivel no carro e da partida, acelerando para fora do acampamento, pelo retrovisor você vê o ASSASSINO MASCARADO olhando voce escapar pelo portão");
                    System.out.println("Você sobreviveu...");
                    System.out.println("FINAL BOM DO CARRO *conquistado");

                } else if (escolhaS == 2) {
                    System.out.println("Voce decide sair correndo pela saída na pernada, colocando seus principios na frente da sobrevivencia");
                    Thread.sleep(tempoC);
                    System.out.println("mas algo estranho... voce não ouve passos atras de você, ele não está mais te perseguindo, você finalmente esca...");
                    Thread.sleep(tempo1);
                    System.out.println("VUP");
                    System.out.println("VUP");
                    System.out.println("VUP");
                    System.out.println("SHLUCK!!!");
                    Thread.sleep(tempo1);
                    System.out.println("O machado crava em seu rosto no momento que você decide olhar para tras´para conferir se ele estava vindo, ele foi arremeçado em você");
                    System.out.println("Sua ultima visão é ELE parado na entrada com um ar de superioridade, o sangue escorre deixando sua visão vermelha, até que ela fica totalmente preta");
                    System.out.println("Você morreu");
                    Thread.sleep(tempo1);
                    System.out.println("FINAL RUIM MACHADO *conquistado*");
                } else {
                    System.out.println("você não tem tempo para pensar demais, ELE te alcançou...");
                    System.out.println("SHLUCK!!!");
                    System.out.println("FINAL RUIM: INDECISO *conquistado*");

                }
                break;

            case 3:
                System.out.println("Talvez tivesse escapatória... tivesse como fugir, mas seria demais para você, então você só aceita...");
                System.out.println("SHLUCK!!!");
                System.out.println("você morreu");
                System.out.println("FINAL DESISTENTE *desbloqueado*");
                break;

            default:
                System.out.println("você não tem tempo para pensar demais, ELE te alcançou...");
                System.out.println("SHLUCK!!!");
                System.out.println("FINAL RUIM: INDECISO *conquistado*");
                break;

        }
    }

}
