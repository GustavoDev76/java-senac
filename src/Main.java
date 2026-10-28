import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = 20;
        double decimal = 100.00;
        boolean boolaeano = true;
        String texto = "Olá!!!,";
        char letra = 'A';

        // EXPLICAÇÃO: Declaração de variáveis de diferentes tipos (número inteiro, número com vírgula, verdadeiro/falso, texto e uma única letra).
        // PARA QUE SERVE: Serve para guardar dados na memória do computador para usarmos depois no programa.

        System.out.println(texto + " qual é o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Seu nome é " + nome);

        // EXPLICAÇÃO: Mostra uma mensagem pedindo o nome e usa o "leitor" para capturar o que você digita no teclado, guardando na variável "nome".
        // PARA QUE SERVE: Serve para interagir com o usuário e receber informações digitadas por ele.

        System.out.println("Qual a sua idade?");
        String idade = leitor.nextLine();

        // EXPLICAÇÃO: Pergunta a idade e lê o texto digitado pelo teclado.
        // PARA QUE SERVE: Serve para recolher a idade da pessoa para fazermos uma verificação a seguir.

        // CONDICIONAIS
        if (Integer.parseInt(idade) >= 65 || Integer.parseInt(idade) <= 18) {
            System.out.println("nao pode entrar");
        } else {
            System.out.println("pode entrar");
        }

        // EXPLICAÇÃO: Transforma a idade que era texto em número (Integer.parseInt) e verifica com "se" (if) e "ou" (||): se a idade for 65 ou mais, ou 18 ou menos, mostra "nao pode entrar". Se não for (else), mostra "pode entrar".
        // PARA QUE SERVE: Serve para tomar decisões no código com base em regras (neste caso, restringir a entrada por idade).

        // FOR (REPETICOES)

        Scanner entrada = new Scanner(System.in);
        int i;
        for ( i = 1; i <= 4; i= i +5){
            if (i % 2 == 0) {
                System.out.print("par");
            } else {
                System.out.print("impar");
            }
        }
        System.out.println(i);

        // EXPLICAÇÃO: Cria um loop (laço de repetição) que começa com "i = 1" e soma 5 a cada volta (i = i + 5). Como o 1 já é menor ou igual a 4, ele entra no "se" (verificando se é par ou ímpar usando o resto da divisão por 2) e depois o "i" passa a valer 6, encerrando o loop. No final, imprime o valor atual do "i" (que será 6).
        // PARA QUE SERVE: Serve para repetir blocos de código várias vezes de forma automatizada.
    }
}