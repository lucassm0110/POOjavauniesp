package segundaQuestao;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral clinico = new ClinicoGeral(true, true);
        Cirurgiao cirurgiao = new Cirurgiao(true);

        System.out.println("Clínico Geral:");
        clinico.tratarPaciente();
        clinico.receitar();

        System.out.println("Cirurgião:");
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}
