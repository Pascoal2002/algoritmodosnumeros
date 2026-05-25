package algoritmodosnumeros;

import java.util.Scanner;

public class PrimosCongruencias {

    Scanner scanner = new Scanner(System.in);

    public void executar() {

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 0;

        for(int i = 1; i <= numero; i++) {

            if(numero % i == 0) {
                contador++;
            }
        }

        if(contador == 2) {
            System.out.println(numero + " é número primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        System.out.println("\nExemplo de congruência:");
        System.out.println("17 ≡ 5 (mod 12)");
    }
}