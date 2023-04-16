package net.roszczyk.zakres;

public class ProgramTestowy {
    public static void main(String[] args)
    {
        for (Integer i : new Range(10, 100)) {
            System.out.println(i);
        }
    }
}
