package questions.pesel;

public class NotCorrectPeselException extends RuntimeException {

    public NotCorrectPeselException(String message) {
        System.out.println(message);
    }
}
