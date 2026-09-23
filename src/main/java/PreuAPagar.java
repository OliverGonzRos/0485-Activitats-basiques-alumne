
import java.util.Scanner;

// Activitat 09 — Preu a pagar amb descompte
// Nota: els decimals s'escriuen amb punt (4.5), no amb coma.
public class PreuAPagar {
    public static void main(String[] args) {
        // TODO: llegeix les unitats (enter), el preu unitari (real) i el
        //       descompte en % (real), i mostra:
        //   El valor a pagar serà: ... euros
        Scanner teclat = new Scanner(System.in);

        System.out.println("Cuantos productos has comprado? ");
        int ProductosComprados = teclat.nextInt();

        System.out.println("Cuanto vale cada producto? ");
        double PrecioProducto = teclat.nextDouble();

        System.out.println("Que descuento aplicamos? ");
        double Descuento = teclat.nextDouble();

        double PrecioTotal = ProductosComprados * PrecioProducto;
        double PrecioFinal = PrecioTotal - (PrecioTotal * Descuento / 100);
         System.out.println("El valor a pagar sera: " + PrecioFinal + "euros");







    }
}
