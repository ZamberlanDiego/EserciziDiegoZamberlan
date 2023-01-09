import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //RETTANGOLO
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci i dati per calcolare area e perimetro di un Rettangolo");
        System.out.println("Inserisci la base:");
        int base = input.nextInt();
        System.out.println("Inserisci l'altezza:");
        int altezza = input.nextInt();
        //PERIMETRO
        int perimetro = (base*2) + (altezza*2);
        System.out.println("Il perimetro del rettangolo è:" + perimetro);
        //AREA
        int area = (base*altezza);
        System.out.println("L'area del rettangolo è:" + area);
        //Triangolo
        System.out.println("Inserisci i dati per calcolare area e perimetro di un Triangolo");
        System.out.println("Inserisci la base");
        base = input.nextInt();
        System.out.println("Inserisci l'altezza");
        altezza = input.nextInt();
        System.out.println("Inserisci il lato");
        area = base * altezza / 2;
        System.out.println("L'area del triangolo è:" + area);
        int lato = input.nextInt();
        perimetro = lato + base + altezza;
        System.out.println("Il perimetro del triangolo è:" + perimetro);
        //CERCHIO
        System.out.println("Inserisci i dati per calcolare l'area e il perimetro di un cerchio");
        System.out.println("Inserisci il diametro");
        int diametro = input.nextInt();
        double perimetroC = diametro *3.14;
        System.out.println("Il perimetro del cerchio è:" + perimetroC);
        System.out.println("Inserisci il raggio del cerchio");
        int raggio = input.nextInt();
        area = raggio*raggio;
        System.out.println("L'area del cerchio è :" + area);
        //Quadrato
        System.out.println("Inserisci i dati per calcolare l'area e il perimetro del quadrato");
        System.out.println("Inserisci un lato del quadrato");
        lato = input.nextInt();
        perimetro = lato * 4;
        System.out.println("Il perimetro del quadrato è:"+ perimetro);
        area = lato * lato;
        System.out.println("l'area del quadrato è:" + area);
        input.close();
    }
}