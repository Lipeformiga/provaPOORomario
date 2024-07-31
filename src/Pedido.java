import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private ArrayList<Produto> itens = new ArrayList<>();
    private String status;

    public Pedido(Cliente cliente,ArrayList<Produto> itens, String status) {
        this.cliente = cliente;
        this.itens = itens;
        this.status = status;
    }

    public Pedido(Cliente cliente, String status) {
        this.cliente = cliente;
        this.status = status;
    }

    public void adicionarItem(Produto item){
        this.itens.add(item);
    }

    public void removerItem(int codigo ){
        this.itens.remove(codigo);
    }

    double calcularTotal(){
        return 0;
    }

    void confirmarPedido(){

    }
}
