package algoritmodosnumeros;

import java.util.Scanner;

public class Fermat {

    Scanner scanner = new Scanner(System.in);

    public void calcular() {

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o número primo p: ");
        int p = scanner.nextInt();

        int resultado = 1;

        for(int i = 1; i < p; i++) {
            resultado = (resultado * a) % p;
        }

        System.out.println("Resultado = " + resultado);
        System.out.println("Segundo Fermat, o resultado deve ser 1.");
    }
}