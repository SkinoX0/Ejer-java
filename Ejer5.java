import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num = teclado.nextInt();

        int resultado = 1;
        int contador = 1;

        while (contador <= num) {
            resultado = resultado * contador;
            contador++;
        }

        System.out.println("El factorial es: " + resultado);
    }
}