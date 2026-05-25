package algoritmodosnumeros;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu() {




    }


    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n===================================");
            System.out.println(" CAPÍTULO 6 - ALGORITMO DOS NÚMEROS");
            System.out.println("===================================");
            System.out.println("1 - Noções da teoria elementar");
            System.out.println("2 - Máximo Divisor Comum");
            System.out.println("3 - Primos e Congruências");
            System.out.println("4 - Algoritmo de Euclides");
            System.out.println("5 - Pequeno Teorema de Fermat");
            System.out.println("6 - Função Totiente de Euler");
            System.out.println("7 - Distribuição de Chaves");
            System.out.println("8 - Sistema RSA");
            System.out.println("9 - Teste de Primalidade");
            System.out.println("10 - Factoração de Inteiros");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch(opcao) {

                case 1:
                    TeoriaElementar t = new TeoriaElementar();
                    t.explicar();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 2:
                    MDC mdc = new MDC();
                    mdc.calcular();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 3:
                    PrimosCongruencias p = new PrimosCongruencias();
                    p.executar();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 4:
                    Euclides e = new Euclides();
                    e.executar();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 5:
                    Fermat f = new Fermat();
                    f.calcular();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 6:
                    Euler eu = new Euler();
                    eu.calcular();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 7:
                    Distribuicaochaves d = new Distribuicaochaves();
                    d.mostrar();

                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
                    break;

                case 8:
                    RSA rsa = new RSA();
                    rsa.executar();
                    scanner.nextLine();
                    System.out.println("\nPrima ENTER para voltar ao menu...");
                    scanner.nextLine();
            }
        }while(opcao != 0);

    }
}