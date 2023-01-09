import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di giorni");
        int giorni = input.nextInt();
        System.out.println("Inserisci il numero di ore");
        int ore = input.nextInt();
        System.out.println("Inserisci il numero di minuti");
        int minuti = input.nextInt();
        System.out.println("Inserisci il numero di secondi");
        int secondi = input.nextInt();
        int seconditotali = (giorni*86400)+(ore*3600)+(minuti*60);
        System.out.println("Il totale dei secondi è:"+seconditotali);

    }
}