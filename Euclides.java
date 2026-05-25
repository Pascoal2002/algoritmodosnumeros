package algoritmodosnumeros;

import java.util.Scanner;

public class Euclides {

    Scanner scanner = new Scanner(System.in);

    public void executar() {

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resto;

        while(b != 0) {

            resto = a % b;

            System.out.println(a + " ÷ " + b + " = resto " + resto);

            a = b;
            b = resto;
        }

        System.out.println("Mdc = " + a);
    }
}