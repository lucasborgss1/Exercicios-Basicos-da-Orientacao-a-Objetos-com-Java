package entidades;

public class ConversorMoeda {
    private double precoDolar, qtdCompra, valorCompra;
    private static double iot = 0.06;

    public ConversorMoeda() {
    }

    public ConversorMoeda(double precoDolar, double qtdCompra) {
        this.precoDolar = precoDolar;
        this.qtdCompra = qtdCompra;
        calculoValorASerPago(precoDolar, qtdCompra);
    }

    private void calculoValorASerPago(double precoDolar, double qtdCompra) {
        this.valorCompra = (precoDolar * qtdCompra) + iot;
    }

    public double getPrecoDolar() {
        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {
        this.precoDolar = precoDolar;
        calculoValorASerPago(precoDolar, qtdCompra);
    }

    public double getQtdCompra() {
        return qtdCompra;
    }

    public void setQtdCompra(double qtdCompra) {
        calculoValorASerPago(precoDolar, qtdCompra);
        this.qtdCompra = qtdCompra;
    }

    @Override
    public String toString() {
        return "Valor a ser pago em reais = R$ " + String.format("%.2f", valorCompra);
    }

}
