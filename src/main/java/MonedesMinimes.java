
import java.util.Scanner;

// Activitat 12 — Monedes mínimes
public class MonedesMinimes {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims i mostra quantes monedes de
        //       cada tipus calen (200, 100, 50, 20, 10, 5, 2, 1), una per línia.
        //       Per a l'entrada 123:
        //   0 monedes de 2 euros
        //   1 monedes d'1 euro
        //   0 monedes de 50 cèntims
        //   1 monedes de 20 cèntims
        //   0 monedes de 10 cèntims
        //   0 monedes de 5 cèntims
        //   1 moneda de 2 cèntims
        //   1 moneda de 1 cèntims

        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra una quantitat en cèntims: ");
        int centims = teclat.nextInt();

        int monedes200 = centims / 200;
        centims = centims % 200;
        // similar al de las horas, para aprovechar el resto

        int monedes100 = centims / 100;
        centims = centims % 100;

        int monedes50 = centims / 50;
        centims = centims % 50;

        int monedes20 = centims / 20;
        centims = centims % 20;

        int monedes10 = centims / 10;
        centims = centims % 10;

        int monedes5 = centims / 5;
        centims = centims % 5;

        int monedes2 = centims / 2;
        centims = centims % 2;

        int monedes1 = centims;

        System.out.println(monedes200 + "monedes de 2 euros");
        System.out.println(monedes100 + "monedes d'1 euro");
        System.out.println(monedes50 + "monedes de 50 cèntims");
        System.out.println(monedes20 + "monedes de 20 cèntims");
        System.out.println(monedes10 + "monedes de 10 cèntims");
        System.out.println(monedes5 + "monedes de 5 cèntims");
        System.out.println(monedes2 + "monedes de 2 cèntims");
        System.out.println(monedes1 + "monedes de 1 cèntim");

        
    }
}
