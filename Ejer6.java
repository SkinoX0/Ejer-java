import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Segundo numero: ");
        int n2 = teclado.nextInt();
        System.out.print("Tercer numero: ");
        int n3 = teclado.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El mayor es el " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("El mayor es el " + n2);
        } else {
            System.out.println("El mayor es el " + n3);
        }
    }
}