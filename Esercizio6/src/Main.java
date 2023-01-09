import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("inserisci il primo numero:");
        float numero1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        float numero2 = input.nextInt();
        float somma= numero1 + numero2;
        System.out.println("La somma è:" +somma);

    }
}