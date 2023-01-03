public class CalculadoraRJ implements CalculadoraICMS{

    int porcentagem = 15;

    @Override
    public double calcular(double valorProduto) {
        return (valorProduto / 100) * porcentagem;
    }
}
