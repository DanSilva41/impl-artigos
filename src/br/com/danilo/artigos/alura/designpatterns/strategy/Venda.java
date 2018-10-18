package br.com.danilo.artigos.alura.designpatterns.strategy;

class Venda {

    private final Funcionario funcionario;
    private final double valor;

    Venda(Funcionario funcionario, double valor) {
        this.funcionario = funcionario;
        this.valor = valor;
    }

    double calculaComissao() {
        Cargo cargo = this.funcionario.getCargo();
        return cargo.calculaComissao(this.valor);
    }
}
