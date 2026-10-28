import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um ano:");
        int ano = leitor.nextInt();

        if (ano % 400 == 0) {
            System.out.println("Bissexto");

        }

        else if (ano % 100 == 0) {
            System.out.println("nao é bissexto");

        }

        else if (ano % 4 == 0) {
            System.out.println("é bissexto");

        }

        else {
            System.out.println("nao é bissexto");
        }






    }
}
