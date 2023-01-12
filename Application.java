import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Calculadora de Imposto: ICMS sobre o valor do produto.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o estado: ");
        String estado = scanner.next();

        System.out.println("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        String saoPaulo = "SP";
        String rioDeJaneiro = "RJ";

        CalculadoraICMS calculadora = null;

        if (saoPaulo.equalsIgnoreCase(estado)){
            calculadora = new CalculadoraSP();
        }

        if (rioDeJaneiro.equalsIgnoreCase(estado)){
            calculadora = new CalculadoraRJ();
        }

        if (Objects.isNull(calculadora)){
            throw new IllegalArgumentException("Estado Invalido");
        }

        double imposto = calculadora.calcular(valorProduto);
        System.out.println("Valor do imposto: " + imposto);

        System.out.println(calculadora instanceof CalculadoraSP);
        System.out.println(calculadora instanceof CalculadoraRJ);

    }


}
