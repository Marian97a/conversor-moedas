import java.util.Random;
import java.util.Scanner;

public class Menu {
private final CoverterMoeda converter = new CoverterMoeda();
private final Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("=== Conversor de Moedas ===");
            System.out.println("1. USD para BRL");
            System.out.println("2. EUR para BRL");
            System.out.println("3. GBP para BRL");
            System.out.println("4. BRL para USD");
            System.out.println("5. BRL para EUR");
            System.out.println("6. BRL para GBP");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao != 0) processarOpcao(opcao);
        } while (opcao != 0);
        System.out.println("Obrigado por usar o conversosr!");
    }

    private void processarOpcao(int opcao) {
        String from = "", to = "";

        switch (opcao) {
            case 1 -> { from = "USD"; to = "BRL"; }
            case 2 -> { from = "EUR"; to = "BRL"; }
            case 3 -> { from = "GBP"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "USD"; }
            case 5 -> { from = "BRL"; to = "EUR"; }
            case 6 -> { from = "BRL"; to = "GBP"; }
            default -> { System.out.println("Opção inválida."); return; }
        }
        System.out.println("Informe o valor a converter: ");
        double valor = scanner.nextDouble();
        converter.convertermoeda(from, to, valor);
    }
}
