
import java.util.Scanner;

// Activitat 04 — Perímetre i àrea d'un quadrat
public class Quadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat (enter) i mostra:
        //   Perímetre del quadrat = ...      (costat x 4)
        //   Àrea del quadrat = ...           (costat x costat)

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix el costat: ");
        int costat = teclat.nextInt();

        int perimetre = costat * 4;
        int area = costat * costat;

        System.out.println("Perímetre del quadrat = " + perimetre);
        System.out.println("Àrea del quadrat = " + area);
    }
}
