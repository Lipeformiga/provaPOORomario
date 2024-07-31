import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GerenciadorDeCardapio gerenciadorDeCardapio1 = new GerenciadorDeCardapio();
        Cliente cliente1 = new Cliente();
        Garcom garcom1 = new Garcom();

        Lanche lanche1 = new Lanche(1,1,"Xtudo",20);
        gerenciadorDeCardapio1.adicionarProduto(lanche1);
        Bebida bebida1 = new Bebida(1,2,"milkshake",15);
        gerenciadorDeCardapio1.adicionarProduto(bebida1);
        Outro outro1 = new Outro("pequeno",3,"Xtudinho",15);
        gerenciadorDeCardapio1.adicionarProduto(outro1);

        Pedido pedido2 = new Pedido(cliente1,"preparando");

        Combo combo1 = new Combo(4, "comboTOP", 40);

        System.out.println("Cardapio:"+ gerenciadorDeCardapio1.listarProdutos());

        System.out.println("valor com o desconto do Xtudo:" + lanche1.calcularpreco(0) + " detalhes do Xtudo: "+ lanche1.exibirDetalhes());
        System.out.println("valor com o desconto do milkshake:"+ bebida1.calcularpreco(0.05)+ " detalhes do milkshake: "+ bebida1.exibirDetalhes());
        System.out.println("valor com o desconto do Xtudinho:"+ outro1.calcularpreco(0.1)+ " detalhes do Xtudinho: "+ lanche1.exibirDetalhes());


        System.out.println("\nPedidos realizados pelo garçom1: pedido2 do cliente1");
        garcom1.cadastrarPedido(cliente1,pedido2);
        garcom1.confirmarPedido();
        //garcom1.adicionarItemAoPedido(lanhce1);//
        //garcom1.removerItemDoPedido(lanche1);//
        System.out.println("valor a ser pago");
        System.out.println(garcom1.calcularPagamento(pedido2));
    }
}
