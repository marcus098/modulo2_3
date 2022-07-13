public class Esercizio4 {
    /* Numeri perfetti
     Un numero perfetto è un numero che è uguale alla somma dei suoi divisori escluso
se stesso.
• Per esempio, il 6 è un numero perfetto perché i suoi divisori escluso se stesso
sono 3,2 e 1 e sommandoli otteniamo di nuovo il 6
• Scrivete un programma che scopre i numeri perfetti fino al 1000
     */
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++){
           if(check(i))
               System.out.println(i);
        }
    }

    public static boolean check(int n){
        int somma = 0;
        for(int i = 1; i < (n/2)+1; i++){
            if((n % i) == 0)
                somma += i;
        }
        if(somma == n)
            return true;
        return false;
    }
}
