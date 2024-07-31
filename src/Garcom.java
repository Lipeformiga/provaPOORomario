public class Garcom extends Pessoa{

    private double pagamento;

    void cadastrarPedido(Cliente cliente, Pedido pedido){
        cliente.fazerPedido(pedido);
    }
    String exibirMenu(){
        return "Menu de pedidos";
    }

    void adicionarItemAoPedido(Pedido pedido, Produto item){
        pedido.adicionarItem(item);
    }

    void removerItemDoPedido(Pedido pedido, int codigo){
        pedido.removerItem(codigo);
    }

    void confirmarPedido(Pedido pedido){
        pedido.confirmarPedido();
    }

    double calcularPagamento(Pedido pedido){
        return pedido.calcularTotal();
    }

    public void confirmarPedido() {
    }
}
