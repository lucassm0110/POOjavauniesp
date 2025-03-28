package segundaQuestao;

public class Matematica {
    private double numero1, numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void somar() {
        System.out.println("Resultado da soma: " + (numero1 + numero2));
    }

    public void subtrair() {
        System.out.println("Resultado da subtração: " + (numero1 - numero2));
    }

    public void multiplicar() {
        System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
    }

    public void dividir() {
        if (numero2 != 0) {
            System.out.println("Resultado da divisão: " + (numero1 / numero2));
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
