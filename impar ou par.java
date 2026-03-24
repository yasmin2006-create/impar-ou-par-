// Yasmin louise Fontes Guimarães
// 12661935138

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero interiro");
        int numero = scanner.nextInt();
        int resultado = numero / 2;
        System.out.println("Resultado da divisao por 2: " + resultado);
        if (numero % 2 == 0) {
        System.out.print("é um numero par");
        } else {
         System.out.print("é um numero impar");
         scanner.close();
        
    }
}
}
