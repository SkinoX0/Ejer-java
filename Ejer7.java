import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = teclado.nextDouble();
            suma = suma + nota;
        }

        double media = suma / 5;
        System.out.println("La media es: " + media);

        if (media >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}