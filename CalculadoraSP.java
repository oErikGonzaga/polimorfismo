public class CalculadoraSP implements CalculadoraICMS{

    int porcentagem = 20;

    @Override
    public double calcular(double valorProduto) {
        return (valorProduto / 100) * porcentagem;
    }
}
