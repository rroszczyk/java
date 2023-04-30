package net.roszczyk.structure;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> translator = new HashMap<>();

        translator.put("kot", "cat");
        translator.put("pies", "dog");
        translator.put("wąż", "snake");

        for (String s : translator.keySet()) {
            System.out.println("Zwierze " + s + " po angielsku " + translator.get(s));
        }
    }
}
