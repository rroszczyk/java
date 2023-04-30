package net.roszczyk.testy;

public class DivideByFiveException extends Exception {

    @Override
    public String getMessage() {
        return "liczba jest podzielna przez 5";
    }
}
