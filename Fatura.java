public class Fatura {
    String numero;
    String descricao;
    int qtdItem;
    double preco;

    public void cadastrar(String numero, String descricao, int qtdItem, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.preco = preco;
    }

    public double totalFatura() {
        this.preco = this.qtdItem * this.preco;

        return this.preco;
    }

    public void informacao() {
        System.out.println("\nInformações do Produto:\n");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Número: " + this.numero);
        System.out.println("Quantidade: " + this.qtdItem);
        System.out.println("Preço: " + this.preco);
        System.out.println("Valor Total: " + totalFatura());
    }

}
