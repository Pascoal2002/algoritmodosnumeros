package algoritmodosnumeros;


import java.util.Scanner;

    public class Factoracao {

        Scanner scanner = new Scanner(System.in);

        public void factorar() {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.print("Factoração: ");

            for(int i = 2; i <= numero; i++) {

                while(numero % i == 0) {

                    System.out.print(i + " ");
                    numero = numero / i;
                }
            }

            System.out.println();
        }
    }

