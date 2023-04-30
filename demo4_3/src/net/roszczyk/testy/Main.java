package net.roszczyk.testy;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public void run() throws IOException {
        int a = 28;
        int b = 2;
        int c = 0;

        try {
            c = a / b;
            if (c % 5 == 0) {
                throw new DivideByFiveException();
            }
            FileInputStream fis = new FileInputStream("Alamakota.txt");
        }
        catch (ArithmeticException e) {
            System.err.println("BŁĄD: " + e.getMessage());
        }
        catch (DivideByFiveException e) {
            System.err.println("BŁĄD: " + e.getMessage());
        }
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        try {
            Main prg = new Main();

            prg.run();
        } catch (Exception e)
        {
            System.out.println("BŁĄD: nie wiem co z nim zrobić " + e.getMessage());
        }
    }
}
