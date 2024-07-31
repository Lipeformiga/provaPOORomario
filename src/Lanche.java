public class Lanche extends Produto{

    private double peso;

    public Lanche(double peso, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.peso = peso;
    }

    @Override
    double calcularpreco(double desconto) {
        desconto = desconto * getPreco();
        return getPreco() - desconto;
    }

    @Override
    String exibirDetalhes() {
        return "Esse lanche tem "+ this.peso + "KG";
    }
}
