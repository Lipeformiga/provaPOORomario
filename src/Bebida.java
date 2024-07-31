public class Bebida extends Produto{

    private double litros;

    public Bebida(double litros,int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.litros = litros;
    }

    @Override
    double calcularpreco(double desconto) {
        desconto = desconto * getPreco();
        return getPreco() - desconto;
    }

    @Override
    String exibirDetalhes() {
        return "essa bebida tem: "+ this.litros +"L";
    }
}
