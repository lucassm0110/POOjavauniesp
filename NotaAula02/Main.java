import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto(101, "Tênis Esportivo", "42", "Preto", 250.00, 10);

        int opcao;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1 - Exibir detalhes do produto");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    produto.exibirDetalhes();
                    break;
                case 2:
                    System.out.print("Digite a quantidade a adicionar no estoque: ");
                    int qtd = scanner.nextInt();
                    produto.adicionarEstoque(qtd);
                    break;
                case 3:
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    int qtdVenda = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Métodos de pagamento: Pix, Espécie, Transferência, Débito, Crédito");
                    System.out.print("Escolha um método de pagamento: ");
                    String metodo = scanner.nextLine();

                    double valorPago = 0;
                    if (metodo.equalsIgnoreCase("Espécie")) {
                        System.out.print("Digite o valor entregue: ");
                        valorPago = scanner.nextDouble();
                    }

                    produto.vender(qtdVenda, metodo, valorPago);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
