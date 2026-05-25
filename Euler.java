package algoritmodosnumeros;

import java.util.Scanner;

public class Euler {

    Scanner scanner = new Scanner(System.in);

    public void calcular() {

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int contador = 0;

        for(int i = 1; i < n; i++) {

            if(mdc(i, n) == 1) {
                contador++;
            }
        }

        System.out.println("φ(" + n + ") = " + contador);
    }

    public int mdc(int a, int b) {

        while(b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }
}
