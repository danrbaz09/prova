
package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class prova_at06 {
    
    public static void mostrarLista(ArrayList<String> animes){
        for (String anime : animes){
            System.out.println(anime);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== RANQUE DE ANIMES ===");
        ArrayList<String> animes = new ArrayList<>();
        while(true){
            System.out.println("Digite um anime (ou fim para fechar a lista): ");
            String nomanime = sc.nextLine();
            
            if (nomanime.equalsIgnoreCase("fim")){
                System.out.println("encerrando adição de animes\nLISTA COMPLETA");
                break;
            }
            animes.add(nomanime);
        }
        mostrarLista(animes);
    }
}


    

