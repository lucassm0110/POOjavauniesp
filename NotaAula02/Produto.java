public class Produto {
    private int codigo;
    private String nome;
    private String tamanho;
    private String cor;
    private double valor;
    private int estoque;

    public Produto(int codigo, String nome, String tamanho, String cor, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
        this.estoque = estoque;
    }

    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Produto ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$" + valor);
        System.out.println("Estoque disponível: " + estoque);
    }

    public boolean vender(int quantidade, String metodoPagamento, double valorPago) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente!");
            return false;
        }

        double valorFinal = calcularPrecoFinal(quantidade, metodoPagamento);

        if (metodoPagamento.equalsIgnoreCase("Espécie") && valorPago < valorFinal) {
            System.out.println("Valor insuficiente! Falta R$" + (valorFinal - valorPago));
            return false;
        }

        estoque -= quantidade;
        System.out.println("Venda realizada com sucesso!");

        if (metodoPagamento.equalsIgnoreCase("Espécie") && valorPago > valorFinal) {
            double troco = valorPago - valorFinal;
            System.out.println("Troco: R$" + troco);
        }

        return true;
    }

    private double calcularPrecoFinal(int quantidade, String metodoPagamento) {
        double precoTotal = valor * quantidade;
        if (metodoPagamento.equalsIgnoreCase("Pix") ||
                metodoPagamento.equalsIgnoreCase("Espécie") ||
                metodoPagamento.equalsIgnoreCase("Transferência") ||
                metodoPagamento.equalsIgnoreCase("Débito")) {
            return precoTotal * 0.95; // 5% de desconto
        } else if (metodoPagamento.equalsIgnoreCase("Crédito")) {
            System.out.println("Pagamento parcelado em 3x de R$" + (precoTotal / 3));
        }
        return precoTotal;
    }

    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
        System.out.println("Estoque atualizado! Quantidade atual: " + estoque);
    }
}
