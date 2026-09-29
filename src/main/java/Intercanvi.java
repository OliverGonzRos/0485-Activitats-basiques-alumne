
import java.util.Scanner;

// Activitat 11 — Intercanvi de dues variables
public class Intercanvi {
    public static void main(String[] args) {
        // TODO: llegeix dos enters (a i b), intercanvia'ls fent servir una
        //       variable auxiliar i mostra'ls després de l'intercanvi:
        //   a = ...
        //   b = ...
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el primer valor: ");
        int a = teclat.nextInt();
        System.out.println("Introdueix el segon valor: ");
        int b = teclat.nextInt();
        int c = a;
        a = b; 
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
