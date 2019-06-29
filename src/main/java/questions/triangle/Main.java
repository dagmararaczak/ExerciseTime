package questions.triangle;

import java.util.Scanner;

/**
 * Napisz klasę, która dla trzech zadanych boków stworzy obiekt trójkąt prostokątny,
 * oraz będzie miała metody zwracające długość przeciwprostokątnej, obwód trójkąta oraz jego pole.
 * Klasa musi być zaprojektowana zgodnie z zasadami programowania obiektowego i obsługiwać błędy przez rzucanie wyjątków (throws)
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRightTriangle = true;


        Triangle triangle = new Triangle();


        int sideA;
        int sideB;
        int sideC;

        while (isRightTriangle) {

            try {


                System.out.println("Podaj boki trojkata prostokatnego (liczby calkowite) : ");
                System.out.println("Podaj bok A");

                sideA = Integer.parseInt(scanner.nextLine());
                System.out.println("Podaj bok B");
                sideB = Integer.parseInt(scanner.nextLine());
                System.out.println("Podaj bok C");
                sideC = Integer.parseInt(scanner.nextLine());

                triangle = new Triangle(sideA, sideB, sideC);

                if (triangle.checkIsItRectangularTriangle()) {
                    isRightTriangle = false;
                    System.out.println("Stworzyles trojkat prostokatny");

                } else {

                    throw new NotRectangularTriangleException("To nie jest trojkat prostokatny");
                }


            } catch (NumberFormatException mismatch) {
                System.out.println("Nie wlasciwy typ danych - wprowadzone dane musza byc liczbami calkowitymi");
            }
        }


        System.out.println("Dlugosc przeciwprostokatnej Twojego trojkata wynosi : " + triangle.getHypotenuse());
        System.out.println("Pole Twojego trojkata wynosi : " + triangle.setTriangleArea());
        System.out.println("Obwod Twojego trojkata wynosi : " + triangle.getTriangleCircumference());


    }
}
