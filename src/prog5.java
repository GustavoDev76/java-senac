import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("escolha os lados:");

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        if (A == B && B == C) {
            System.out.println("Equilátero");
        }

        else if (A != B && A != C && B != C) {
            System.out.println("Escaleno");

        }
        else {
            System.out.println("Isósceles");
        }
    }
}
