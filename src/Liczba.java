import java.util.Scanner;
import java.util.Random;

public class Liczba {
    public static void main(String args[]) {
        new Liczba().start();
    }
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

   public void start(){

       int liczba2 = random.nextInt((57-47)+47);
       System.out.println("Zgadnij liczbę:");
       int point = 0;

        while (true){

            int liczba1 = scanner.nextInt();

            if (liczba1 > liczba2){
                System.out.println("Podana liczba jest za duża.");
                point +=1;
            } else if (liczba1 < liczba2){
                System.out.println("Podana liczba jest za mała.");
                point +=1;
            }  else {
                System.out.println("Tak! Udało Ci się zgadnąć liczbę!");
                break;
            }
            if (point == 5){
                System.out.print("Nie udało Ci się zgadnąć" + "\n" +
                        "Wylosowana liczba to: " + liczba2);
                break;
            }
        }
    }
}
