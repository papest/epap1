package animals;

public class WrongFoodException extends Throwable {
    public WrongFoodException(String s) {
        System.out.println(s);
    }
}
