import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite um numero para o saque:");
        int valor = Leitor.nextInt();

        int restante = valor;

        int n100 = restante / 100;
        restante = restante % 100;

        int n50 = restante / 50;
        restante = restante % 50;

        int n20 = restante / 20;
        restante = restante % 20;

        int n10 = restante / 10;
        restante = restante % 10;

        int n5 = restante / 5;
        restante = restante % 5;

        int n2 = restante / 2;
        restante = restante % 2;

        int m1 = restante;

        System.out.println("100: " + n100 + "| 50: " + n50 + "| 20: " + n20 + "| 10: " + n10 + "| 5: " + n5 + "| 2: " + n2 + "| 1: " + m1);

        Leitor.close();

    }
}
