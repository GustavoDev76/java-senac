import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteirom de 3 digitos:");
        int numero = Leitor.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        int soma = centena + dezena + unidade;

        int invertido = (unidade * 100) + (dezena * 10) + centena;

        System.out.println("Centena: " + centena + " | Dezena: " + dezena + " | Unidade: " + unidade);
        System.out.println("Soma dos dígitos: " + soma);
        System.out.println("Invertido: " + invertido);

        Leitor.close();

    }
}

