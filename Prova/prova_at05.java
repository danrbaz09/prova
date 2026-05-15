
package prova;
import java.util.Scanner;
public class prova_at05 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] filmes = new String[3][3];
        System.out.println("=== TV SHOW TIME ===");
        System.out.println("classificação e avaliação de top3 filmes\ncoloque o nome do filme, gênero e a nota do filme.");
        for (int i = 0; i < 3; i++) {

            System.out.println("\nFilme " + (i + 1));

            System.out.print("Título: ");
            filmes[i][0] = sc.nextLine();

            System.out.print("Gênero: ");
            filmes[i][1] = sc.nextLine();

            System.out.print("Nota: ");
            filmes[i][2] = sc.nextLine();
        }

        System.out.println("\n=== RELATÓRIO DOS FILMES ===");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nFilme " + (i + 1));
            System.out.println("Título: " + filmes[i][0]);
            System.out.println("Gênero: " + filmes[i][1]);
            System.out.println("Nota: " + filmes[i][2]);
        }

}
}
