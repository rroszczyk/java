package net.roszczyk.structure;

public class MyException extends Exception {
    private int value;
    public MyException(int value) {
        this.value = value;
    }
    @Override
    public String getMessage() {
        return "Liczba " + value + " jest podzielna przez 5";
    }
}
