package segundaQuestao;

public class Cirurgiao extends Medico {

    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    public void fazerIncisao() {
        System.out.println("O cirurgião está fazendo uma incisão.");
    }
}
