public class Outro extends Produto{

    private String tamanho;

    public Outro(String tamanho, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    double calcularpreco(double desconto) {
        desconto = desconto * getPreco();
        return getPreco() - desconto;
    }

    @Override
    String exibirDetalhes() {
        return "esse item é"+ this.tamanho;
    }


}
