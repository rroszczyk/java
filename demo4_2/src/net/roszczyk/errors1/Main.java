package net.roszczyk.errors1;

import net.roszczyk.structure.MyException;
import net.roszczyk.structure.NotIntException;
import net.roszczyk.structure.NotStringException;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public void func(Object... o) throws NotIntException, NotStringException {
        if (o.length != 2) {
            System.out.println("Funkcję należy wywołać z dwoma parametrami: 1 - int, 2 - String");
        } else {
            if (o[0] instanceof Integer) {
                System.out.println("Robię coś z parametrem pierwszym");
            } else {
                throw new NotIntException();
            }
            if (o[1] instanceof String) {
                System.out.println("Robię coś z drugim parametrem");
            } else {
                throw new NotStringException();
            }
        }
    }
    public void run(String[] args) throws IOException {
        int a = 28;
        int b = 2;
        int c;

        try {
            c = a / b;
            if (c % 5 == 0) {
                throw new MyException(c);
            }
            FileInputStream fis = new FileInputStream("alamakota.txt");
        }
        catch (ArithmeticException e) {
            System.out.println("BŁAD:" + e.getMessage());
        }
        catch (MyException e) {
            System.out.println("BŁAD:" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            Main prog = new Main();

            prog.func("ala ma kota", 234);

            prog.run(args);
        }
        catch (NotIntException e) {
            System.out.println("Parametr funkcji nie był typu Integer");
        }
        catch (NotStringException e) {
            System.out.println("Parametr funkcji nie był typu String");
        }
        catch (Exception e) {
            System.out.println("Nie wiem co zrobić z tym błędem");
        }
    }
}
