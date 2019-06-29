package questions.modulo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameSurnameModuloChecker {

    private String nameAndSurname;
    private Map<Character, Integer> alphabet = new HashMap<>();
    private char[] nameAndSurnameLetters;


    public NameSurnameModuloChecker(String name) {
        this.nameAndSurname = name;
        this.alphabet = fillTheAlphabetMap();
        this.nameAndSurnameLetters = getNameToCharArray(name);
    }

    public char[] getNameToCharArray(String nameAndSurname) {

        String upperCase = nameAndSurname.toUpperCase();

        return upperCase.toCharArray();

    }

    public Map<Character, Integer> fillTheAlphabetMap() {

        List<Character> collect = IntStream.rangeClosed('A', 'Z').mapToObj(var -> (char) var).collect(Collectors.toList());
        collect.add(0, ' ');

        for (int i = 0; i < collect.size(); i++) {
            alphabet.put(collect.get(i), i);
        }

        return alphabet;

    }

    public Map<Character, Integer> getAlphabet() {
        return alphabet;
    }


    public int getTotal() {

        int sumNameAndSurnameLetters = 0;

        for (int i = 0; i < nameAndSurnameLetters.length; i++) {

            for (Map.Entry<Character, Integer> element : alphabet.entrySet()) {

                String letter = Character.toString(nameAndSurnameLetters[i]);
                String alphabetLetter = Character.toString(element.getKey());

                if (letter.equals(alphabetLetter)) {
                    sumNameAndSurnameLetters += element.getValue();
                    break;
                }
            }
        }

        return sumNameAndSurnameLetters;

    }


    public int getModulo() {

        return getTotal() % 2;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameSurnameModuloChecker that = (NameSurnameModuloChecker) o;
        return Objects.equals(nameAndSurname, that.nameAndSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname);
    }
}
