package terceiraQuestao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Informe o preço: ");
        produto.setPreco(scanner.nextDouble());

        System.out.print("Informe a quantidade em estoque: ");
        produto.setQuantidade(scanner.nextInt());

        int opcao;

        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Adicionar ao estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = scanner.nextInt();
                    produto.adicionarEstoque(adicionar);
                    break;
                case 2:
                    System.out.print("Quantidade a vender: ");
                    int vender = scanner.nextInt();
                    produto.vender(vender);
                    break;
                case 3:
                    produto.exibirEstoque();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
