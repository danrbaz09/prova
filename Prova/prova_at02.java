package prova;

import java.util.Scanner;

public class prova_at02 {

        public static String analisarGargalo(int cpu, int gpu) {

            int diferenca = Math.abs(cpu - gpu);

            if (diferenca <= 15) {
                return "Sistema equilibrado!\nsem risco de gargalo.";
            } else if (cpu > gpu) {
                return "Gargalo na GPU!\nrevise seu hardware.";
            } else {
                return "Gargalo na CPU!";
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("==AVALIADOR DE GARGALO==");
            System.out.println("Coloque a nota de sua CPU e GPU de 1 a 100 para avaliar se seu pc esta ou estara com gargalo");
            System.out.print("Nota da CPU: ");
            int cpu = sc.nextInt();

            System.out.print("Nota da GPU: ");
            int gpu = sc.nextInt();

            String resultado = analisarGargalo(cpu, gpu);

            System.out.println(resultado);

        }
    }

