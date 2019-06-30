package questions.pesel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String yourPesel = scanner.nextLine();


        if ((yourPesel.length() < 11 | yourPesel.length() > 11) | yourPesel.contains("[a-zA-Z]+")) {

            throw new NotCorrectPeselException("Nieprawidlowa forma peselu");

        }


        Pesel pesel = new Pesel(yourPesel);


        System.out.println("Zyjesz juz : " + pesel.countHowLongDoYouLive());
        System.out.println("Modulo z liczby dni : " + pesel.checkModuloFromYourLifeDays());
    }
}
