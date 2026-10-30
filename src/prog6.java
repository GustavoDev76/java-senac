import java.util.Scanner;
public class prog6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("escolha 3 numeros:");

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if (a <= b && b <= c) {
            System.out.println(a + "-" + b + "-" + c);

        }

        else if (a <= c && c <= b) {
            System.out.println(a + "-" + c + "-" + b);
        }

        else if (b <= a && a <= c) {
            System.out.println(b + "-" + a + "-" + c);
        }

        else if (b <= c && c <= a) {
            System.out.println(b + "-" + c + "-" + a);

        }

        else if (c <= a && a <= b) {
            System.out.println(c + "-" + b + "-" + a);
        }

        else {
            System.out.println(c + "-" + b + "-" + a);
        }
    }
}
