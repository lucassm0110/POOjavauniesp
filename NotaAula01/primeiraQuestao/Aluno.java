package primeiraQuestao;

public class Aluno {
    private String nome;
    private double n1, n2, n3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setN1(double nota) {
        this.n1 = nota;
    }

    public double getN1() {
        return this.n1;
    }

    public void setN2(double nota) {
        this.n2 = nota;
    }

    public double getN2() {
        return this.n2;
    }

    public void setN3(double nota) {
        this.n3 = nota;
    }

    public double getNota3() {
        return this.n3;
    }

    public void calcularMedia() {
        double mediaFinal = (n1 + n2 + n3) / 3;
        System.out.printf("Média = %.2f\n", mediaFinal);

        if (mediaFinal >= 70) {
            System.out.println("Status: Aprovado!");

        } else if (mediaFinal >= 40) {
            System.out.println("Status: Prova final.");

        } else {
            System.out.println("Status: Reprovado.");
        }
    }
}