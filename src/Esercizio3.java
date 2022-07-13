public class Esercizio3 {
    /* Numeri primi
    Un numero primo è un numero che è divisibile solo per se stesso e 1.
• Scrivete un programma che dato un numero N, scopre tutti i numeri primi fino a N.
• Provate a ottimizzare il programma per renderlo il più veloce possibile, ci sono
diversi trick che potete fare per velocizzarlo
     */
    public static void main(String[] args) {
        find(100);
    }

    public static void find(int n){
        for(int i = 2; i < n; i++){
            if(control(i))
                System.out.println(i);
        }
    }

    public static boolean control(int n){
        for(int i = 2; i < n; i++){
            if((n % i) == 0)
                return false;
        }
        return true;
    }
}
