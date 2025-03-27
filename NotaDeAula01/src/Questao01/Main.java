package Questao01;
import java.util.Scanner;
//Defina uma classe Aluno que faça o cadastro do nome e das 3 notas e a operação do cálculo
//da média. Ao final, exiba (na classe principal) a média. Em seguida, informe se ele está
//aprovado, reprovado ou na final. Se a média for >= 70 está aprovado, abaixo de 40 está
//reprovado, senão, está na final.
public class Main {
    public static void main(String[] args) {
        Aluno luis = new Aluno("Luis",70,80,90);
        Scanner teclado = new Scanner(System.in);
        Aluno aluno2 = new Aluno();

        System.out.println("Digite seu nome");
        aluno2.setNome(teclado.next());

        System.out.println("Digite primeira nota");
        aluno2.setNota1(teclado.nextDouble());

        System.out.println("Digite segunda nota");
        aluno2.setNota2(teclado.nextDouble());

        System.out.println("Digite terceira nota");
        aluno2.setNota3(teclado.nextDouble());

        double mediaAluno2 = aluno2.media();

        if (mediaAluno2>= 70){
            System.out.println("Aprovado");
        } else if (mediaAluno2> 39) {
            System.out.println("Está na final");
        } else {
            System.out.println("Reprovado!");
        }





        //---------------------- Com constructor--------------
        double media = luis.media();


        if (media >= 70){
            System.out.println("Aprovado");
        } else if (media > 39) {
            System.out.println("Está na final");
        } else {
            System.out.println("Reprovado!");
        }

    }
}