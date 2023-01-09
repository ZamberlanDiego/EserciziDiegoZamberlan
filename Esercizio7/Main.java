import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci il primo valore");
        Scanner input = new Scanner(System.in);
        int valore1 = input.nextInt();

        System.out.println("inserisci il secondo valore");
        int valore2 = input.nextInt();

        int somma = valore1+ valore2;
        System.out.println("il risultato è:"+ somma);

        int sottrazione = valore1- valore2;
        System.out.println("il risultato è:"+ sottrazione);

        int moltiplicazione = valore1* valore2;
        System.out.println("il risultato è:"+ moltiplicazione);

        int divisione = valore1/ valore2;
        System.out.println("il risultato è:"+ divisione);
    }
}