package primeiraQuestao;

public class Leao extends Animal {
    private boolean juba;

    public Leao(float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public void cacar() {
        System.out.println("O leão está caçando sua presa!");
    }
}
