package terceiraQuestao;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidadeAdicionar) {
        this.quantidade += quantidadeAdicionar;
        System.out.println("Novo estoque: " + this.quantidade);
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > this.quantidade) {
            System.out.println("Estoque insuficiente para a venda.");
        } else {
            this.quantidade -= quantidadeVendida;
            double totalVenda = this.preco * quantidadeVendida;
            System.out.println("Venda realizada. Total: R$" + totalVenda);
        }
    }

    public void exibirEstoque() {
        System.out.println("Quantidade disponível em estoque: " + this.quantidade);
    }
}
