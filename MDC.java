package algoritmodosnumeros;

import java.util.Scanner;

public class MDC {

    Scanner scanner = new Scanner(System.in);

    public void calcular() {

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int mdc = 1;

        System.out.println("\nDivisores comuns:");

        for(int i = 1; i <= a && i <= b; i++) {

            if(a % i == 0 && b % i == 0) {

                System.out.print(i + " ");
                mdc = i;
            }
        }

        System.out.println("\nMDC = " + mdc);
    }
}
