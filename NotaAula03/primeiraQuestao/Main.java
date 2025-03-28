package primeiraQuestao;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo(1.8f, "Marrom", "Mangalarga");
        Leao leao = new Leao(1.2f, "Amarelo", true);

        System.out.println("Cavalo:");
        cavalo.comer();
        cavalo.fugir();

        System.out.println("Leão:");
        leao.comer();
        leao.cacar();
    }
}
