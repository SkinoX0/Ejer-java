import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantos numeros quieres ver?: ");
        int n = teclado.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}