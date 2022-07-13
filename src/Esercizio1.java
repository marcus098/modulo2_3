import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    /* Dado
    • Non tutti i dadi hanno 6 facce! Per ogni evenienza vogliamo simulare il lancio di un
dado con un numero arbitrario di facce
• Scrivete un programma che estrae casualmente un valore da un dado ad n facce (un
intero compreso tra 1 e n)
• Provate a implementare diverse soluzioni del programma, utilizzando i diversi
metodi per estrarre un valore casuale
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci numero facce: ");
        int n = sc.nextInt();
        Random rnd = new Random();
        System.out.println((rnd.nextInt(n) + 1));
    }
}
