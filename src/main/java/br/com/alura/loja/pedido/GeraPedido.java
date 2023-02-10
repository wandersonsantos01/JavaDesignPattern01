package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String nome;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String nome, BigDecimal valorOrcamento, int quantidadeItens) {
        this.nome = nome;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
