import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;
public class prog7 {
    public static void main(String[] args){
        System.out.println("+ = adicao");
        System.out.println("- = subtracao");
        System.out.println("* =muliplicacao");
        System.out.println("/ = divisao");
        System.out.println("escolha o operador:");

        Scanner leitor = new Scanner(System.in);
        String operador = leitor.nextLine();

        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();

        double adicao = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;


        if (operador.equals("+")) {
            System.out.println("RESULTADO: " + adicao);

        }

        else if (operador.equals("-")) {
            System.out.println("RESULTADO: " + subtracao);
        }

        else if (operador.equals("*")) {
            System.out.println("RESULTADO: " +  multiplicacao);
        }

        else if (operador.equals("/")) {
            if (numero2 != 0) {
                System.out.println("RESULTADO: " +  divisao);
            } else {
                System.out.println("Divisao dividido por Zero!");
            }

            }
        else {
            System.out.println("ERROR...");
        }

        }

    }