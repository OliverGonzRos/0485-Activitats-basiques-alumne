// Activitat 05 — Operacions aritmètiques fonamentals

import java.util.Scanner;

public class OperacionsMatematiques {
    public static void main(String[] args) {
        // TODO: llegeix dos enters i mostra suma, resta, producte i divisió:
        //   4 + 2 = 6
        //   4 - 2 = 2
        //   4 * 2 = 8
        //   4 / 2 = 2
        try {
            
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Entra un numero: ");
        int numero1 = teclat.nextInt();

        System.out.println("Entra un número: ");
        int numero2 = teclat.nextInt();

        int resultat = numero1 + numero2;
        System.out.println(numero1+" + "+numero2+" = "+resultat);
        resultat = numero1 + numero2;

        System.out.println(numero1+" - "+numero2+" = "+ resultat);
        resultat = numero1 * numero2;
        System.out.println(numero1+" * "+numero2+" = "+resultat);
        resultat = numero1 / numero2;
        System.out.println(numero1+" / "+numero2+" = "+resultat);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
