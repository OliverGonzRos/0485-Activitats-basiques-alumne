
import java.util.Scanner;

// Activitat 08 — Suma i mitjana de 4 enters
public class SumaMitjana {
    public static void main(String[] args) {
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introduce un primer numero");
        double numero1 = teclat.nextDouble();

        System.out.println("Introduce un segundo numero");
        double numero2 = teclat.nextDouble();

        System.out.println("Introduce un tercer numero");
        double numero3 = teclat.nextDouble();

        System.out.println("Introduce un cuarto numero");
        double numero4 = teclat.nextDouble();

        double suma = numero1 + numero2 + numero3 + numero4;
        double mitjana = suma / 4;

        System.out.println("La suma es: " + suma);
        System.out.println("La mitjana es: " + mitjana);
        



    }
}
