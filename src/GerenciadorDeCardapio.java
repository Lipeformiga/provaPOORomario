import java.util.ArrayList;

public class GerenciadorDeCardapio {

    private ArrayList<Produto> cardapio = new ArrayList<>();

    void adicionarProduto(Produto produto){
        this.cardapio.add(produto);
    }

    public ArrayList<Produto> getCardapio() {
        return cardapio;
    }

    void removerProduto(int codigo ){
        this.cardapio.remove(codigo);
    }

    void editarProduto(int codigo, Produto novoProduto){

    }

    public String listarProdutos() {
        return "GerenciadorDeCardapio{" +
                "cardapio=" + cardapio +
                '}';
    }
}
