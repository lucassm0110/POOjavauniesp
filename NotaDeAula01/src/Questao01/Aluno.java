package Questao01;

public class Aluno {
    private String nome;
    private double nota1, nota2 ,nota3;

    public Aluno(String nome, double nota1, double nota3, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota3 = nota3;
        this.nota2 = nota2;
    }

    public Aluno(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double media(){
        return (nota1+nota2+nota3)/3;
    }
}
