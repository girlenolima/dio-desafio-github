package br.com.projeto.calculadora.model;

public class CalculadoraModel {

    private Double valor1;
    private Double valor2;
    private String operacao;

    public CalculadoraModel() {
    }

    public CalculadoraModel(Double valor1, Double valor2, String operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "ModelCalculadora{" +
                "valor1=" + valor1 +
                ", valor2=" + valor2 +
                ", operacao='" + operacao + '\'' +
                '}';
    }
}



