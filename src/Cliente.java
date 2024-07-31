import java.util.ArrayList;

public class Cliente extends Pessoa{

    ArrayList<Pedido> pedidos = new ArrayList<>();



    public void fazerPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void cancelarPedido(Pedido pedido){
        this.pedidos.remove(pedido);
    }

    public String visualizarPedidos() {
        return "Cliente{" +
                "pedidos=" + pedidos +
                '}';
    }


}
