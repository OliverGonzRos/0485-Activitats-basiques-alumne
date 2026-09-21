
import java.util.Scanner;

// Activitat 07 — Convertir Fahrenheit a Celsius
public class Temperatura {
    public static void main(String[] args) {
        // TODO: llegeix una temperatura en graus Fahrenheit (número real)
        //       i mostra-la en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en Fahrenheit: ");
        double temperatureF = teclat.nextDouble();
        double temperatureC = ((temperatureF - 32) * 5) / 9;
        System.out.println("La temperatura en celsius es: " + temperatureC);

    }
}
