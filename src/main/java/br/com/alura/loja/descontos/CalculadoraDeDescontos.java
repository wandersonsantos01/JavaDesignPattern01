package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDescontos = new DescontoMaisCincoItens(
                new DescontoValorMaiorQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDescontos.calcular(orcamento);
    }
}
