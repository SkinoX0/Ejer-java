import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num = teclado.nextInt();

        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}