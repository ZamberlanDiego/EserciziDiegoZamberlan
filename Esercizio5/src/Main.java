import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero di secondo totali");

        int seconditotali = input.nextInt();

        int giorni = seconditotali/86400;
        int restog = seconditotali % 86400;
        System.out.println("i giorni sono:"+giorni);

        int ore = seconditotali/3600;
        int restoo = seconditotali %3600;
        System.out.println("Le ore sono:"+ore);

        int minuti = seconditotali/60;
        int restom = seconditotali %60;
        System.out.println("Le minuti sono:"+minuti);

        int secondi = seconditotali/1;
        int restos = seconditotali%1;
        System.out.println("I secondi sono:"+restom);





    }
}