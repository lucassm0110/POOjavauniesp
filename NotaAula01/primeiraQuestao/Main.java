package primeiraQuestao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Olá! Cadastrar o aluno para verificar a situação: .");

        System.out.print("Informe seu nome: ");
        aluno.setNome(scanner.next());

        System.out.print("Informe a primeira nota: ");
        aluno.setN1(scanner.nextDouble());

        System.out.print("Informe a segunda nota: ");
        aluno.setN2(scanner.nextDouble());

        System.out.print("Informe a terceira nota: ");
        aluno.setN3(scanner.nextDouble());

        System.out.println("Nome do aluno: " + aluno.getNome());
        aluno.calcularMedia();

        scanner.close();
    }
}
