package algoritmodosnumeros;

import java.util.Scanner;

public class Testeprimalidade {

    Scanner scanner = new Scanner(System.in);

    public void verificar() {

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 0;

        for(int i = 1; i <= numero; i++) {

            if(numero % i == 0) {
                contador++;
            }
        }

        if(contador == 2) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
