package prova;

import java.util.HashSet;
import java.util.Scanner;

public class prova_at08 {

        static HashSet<String> cpfs = new HashSet<>();

        public static void CPFs() {

            cpfs.add("11111111111");
            cpfs.add("22222222222");
            cpfs.add("33333333333");
        }

        public static boolean verificarCPF(String cpf) {

            return cpfs.contains(cpf);
        }

        public static void main(String[] args) throws InterruptedException {

            Scanner sc = new Scanner(System.in);
            int tempo = 2000;
            CPFs();
            System.out.println("=== SESSÃO DE CINEMA ===");
            System.out.println("'pode entrar senhorita Rosalin, tenha uma boa sessão!'");
            Thread.sleep(tempo);
            System.out.println("pode passar o próximo...");
            Thread.sleep(tempo);
            System.out.println("Olá senhor bem vindo, qual seu cpf senhor, temos que conferir se você está cadastrado na lista de convidados VIPs");
            System.out.print("Então, qual seu CPF? ");
            String cpf = sc.nextLine();

            if (verificarCPF(cpf)) {
                System.out.println("Você está cadastrado na lista, aproveita a sessão senhor!!");
            } else {
                System.out.println("Você não está registrado na lista VIPs senhor, peço que se retire por favor.");
            }

        }
    }

