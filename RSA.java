package algoritmodosnumeros;

import java.util.Scanner;

public class RSA {

    Scanner scanner = new Scanner(System.in);

    public void executar() {

        System.out.print("Digite o valor de p: ");
        int p = scanner.nextInt();

        System.out.print("Digite o valor de q: ");
        int q = scanner.nextInt();

        int n = p * q;

        int fi = (p - 1) * (q - 1);

        System.out.println("\nn = p * q");
        System.out.println("n = " + n);

        System.out.println("\nφ(n) = (p - 1) * (q - 1)");
        System.out.println("φ(n) = " + fi);

        System.out.println("\nExemplo de chave pública: (3," + n + ")");
        System.out.println("Exemplo de chave privada: (7," + n + ")");
    }
}