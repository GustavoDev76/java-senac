import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de segundos:");
        int TotalSegundos = Leitor.nextInt();

        int dias = TotalSegundos/86400;
        int restoDias = TotalSegundos % 86400;

        int horas = restoDias / 3600;
        int restoHoras = restoDias % 3600;

        int minutos = restoHoras / 60;
        int segundos = restoHoras % 60;

        System.out.println(dias + " dia(s), " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");

        Leitor.close();

    }
}
