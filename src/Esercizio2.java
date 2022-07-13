import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {
    /* Stringa casuale
    A partire da un array di stringhe, es. [‘Andrea’, ‘Marco’, ‘Melvin’, …], vogliamo
estrarre uno dei valori presenti in esso
• Scrivete un programma che dato un array di stringhe, estrae casualmente una
delle stringhe
• Provate a implementare diverse soluzioni del programma, utilizzando i diversi
metodi per estrarre un valore casuale e provando ad estrarre la stringa con una
probabilità non omogenea, es. ‘Andrea’ viene estratto il 50% delle volte, ‘Marco’ il
20%, …
     */
    public static void main(String[] args) {
        String[] str = {"Andrea", "Marco", "Melvin", "Giovanni"};
        int tmp = 100;
        int[] n = new int[str.length];
        Random rnd = new Random();
        for (int i = 0; i < n.length - 1; i++) {
            if (tmp > 0) {
                n[i] = rnd.nextInt(tmp) + 1;
                tmp -= n[i];
                System.out.println(n[i]);
            } else
                break;
        }
        n[n.length - 1] = tmp;
        tmp = (rnd.nextInt(100 / (str.length + 1)));

        int i = 0;
        System.out.println(str[1]);
        System.out.println("estratto n: " + tmp);
        while (i < n.length) {
            if (tmp <= n[i]) {
                System.out.println("Stringa estratta: " + str[i]);
                break;
            }
            i++;
        }
    }
}
