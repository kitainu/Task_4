import java.util.Scanner;

public class Calc {

   // enum Calc{ adding, dividing,multiplying, substracing}
    public static void main(String[] args) {


        System.out.println("Podaj pierwszą liczbę: ");
        Scanner firstNumb = new Scanner(System.in);
        float x = firstNumb.nextFloat();
        System.out.println("Podaj drugą liczbę: ");
        Scanner secondNumb = new Scanner(System.in);
        float y = secondNumb.nextFloat();
        System.out.println("Wybierz dzałanie: + - * / ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0); // pobieranie chara

        System.out.println(" Wklikano: "+ x + c + y);


        Calculate calculate = new Calculate();
        float wynik =calculate.oblicz(x,c,y);
    }
}
