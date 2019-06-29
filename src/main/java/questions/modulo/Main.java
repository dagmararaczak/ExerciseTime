package questions.modulo;

/**
 *
 * 1.Napisz program, który „policzy” modulo2z Twojego pełnegoimienia i nazwiska.
 * Każdej literze w alfabecie przyporządkuj jej numer w alfabecie łacińskim.
 * Np. litera A ma pozycje 1, C ma pozycje 3, (...) Z ma pozycje 26.
 * Zsumuj pozycje liter, a następnie wykonaj działanie modulo 2. Dla swojej klasy liczącej rozwiązanie przygotuj 3 testy jednostkowe.
 * Przykład: Jan Ul => J (10), a (1), n (14), _ (0), U (21), l (12) = 10+1+14+0+21+12 = 58 mod 2 = 0.
 * Uwagi techniczne:Na potrzeby zadania przyjmijmy, że spacja ma pozycje 0.
 * Jeżeli w Twoim imieniu lub nazwisku występują polskie znaki zamień litery na odpowiadające im w alfabecie łacińskim –ó = o, ż/ź = z itd.
 *
 */

public class Main {
    public static void main(String[] args) {

        NameSurnameModuloChecker checker = new NameSurnameModuloChecker("Dagmara");

        System.out.println(checker.getModulo());
    }
}
