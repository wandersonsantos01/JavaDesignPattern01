package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisCincoItens extends Desconto{
    public DescontoMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
