import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pergunta o salário bruto para o usuário
        System.out.println("Digite o valor do salário bruto:");
        double bruto = teclado.nextDouble();

        double taxaInss = 0;
        double taxaVt = 0;

        // Descobre a taxa do INSS conforme o salário
        if (bruto >= 2000) {
            taxaInss = 0.11; // 11%
        } else if (bruto >= 1500) {
            taxaInss = 0.09; // 9%
        } else {
            taxaInss = 0.08; // 8%
        }

        // Descobre a taxa do Vale-Transporte conforme o salário
        if (bruto >= 1000) {
            taxaVt = 0.06; // 6%
        } else {
            taxaVt = 0.05; // 5%
        }

        // Calcula o salário líquido usando a fórmula do exercício
        double liquido = bruto - (bruto * taxaInss) - (bruto * taxaVt);

        // Mostra o resultado na tela
        System.out.println("O salário líquido é: R$ " + liquido);

        teclado.close();
    }
}