package segundaQuestao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematica operacao = new Matematica();
        int escolha;

        do {
            System.out.println("Escolha a operação desejada:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                System.out.print("Digite o primeiro número: ");
                operacao.setNumero1(scanner.nextDouble());

                System.out.print("Digite o segundo número: ");
                operacao.setNumero2(scanner.nextDouble());
            }

            switch (escolha) {
                case 1:
                    operacao.somar();
                    break;
                case 2:
                    operacao.subtrair();
                    break;
                case 3:
                    operacao.multiplicar();
                    break;
                case 4:
                    operacao.dividir();
                    break;
                case 0:
                    System.out.println("Calculadora encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (escolha != 0);

        scanner.close();
    }
}