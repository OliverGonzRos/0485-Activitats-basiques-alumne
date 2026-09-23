// Activitat 11 — Intercanvi de dues variables
public class Intercanvi {
    public static void main(String[] args) {
        // TODO: llegeix dos enters (a i b), intercanvia'ls fent servir una
        //       variable auxiliar i mostra'ls després de l'intercanvi:
        //   a = ...
        //   b = ...
        int a = 10;
        int b = 20;

        int c = a;
        a = b; 
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
