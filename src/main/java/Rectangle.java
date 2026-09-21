
import java.util.Scanner;

// Activitat 06 — Perímetre i àrea d'un rectangle
public class Rectangle {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit (enters) i mostra:
        //   Perímetre del rectangle = ...    (costatGran x 2 + costatPetit x 2)
        //   Àrea del rectangle = ...         (costatGran x costatPetit)
        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el costat Gran");
        int costatGran = teclat.nextInt();

        System.out.println("Introdueix el costat Petit");
        int costatPetit = teclat.nextInt();

        int perimetre = costatGran * 2 + costatPetit *2;
        int area = costatGran * costatPetit;

        System.out.println("Perimetre del rectangle = " + perimetre);
        System.out.println("Area del rectangle = " + area);





    }
}
