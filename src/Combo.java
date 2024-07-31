import java.util.ArrayList;

public class Combo extends Produto{

    private ArrayList<Produto> produtos = new ArrayList<>();
    private double desconto = 0;

    public Combo(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    double calcularDesconto(){
        if (produtos.size() == 2){
            desconto = 0.05;
            return desconto;
        }
        else if (produtos.size() == 3){
            desconto = 0.1;
            return desconto;
        }
        else if(produtos.size() >= 4){
            desconto = 0.15;
            return desconto;
        }
        return desconto;
    }

    @Override
    double calcularpreco(double desconto) {
        desconto = getPreco() * calcularDesconto();
        return getPreco() - desconto;
    }

    @Override
    String exibirDetalhes() {
        return "esse produto tem um valor de: " + calcularDesconto() + "por causa do desconto de:" ;
    }


}
