package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarlPedidoBancoDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "João";
        BigDecimal valorOrcamento = new BigDecimal("600.01");
        int quantidadeItens = Integer.parseInt("4");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarlPedidoBancoDados(),
                        new EnviarEmailPedido()
                )
        );
        handler.execute(gerador);
    }

}
