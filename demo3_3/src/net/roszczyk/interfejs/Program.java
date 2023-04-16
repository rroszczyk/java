package net.roszczyk.interfejs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args)
    {
        List<Object> device = new ArrayList<>();

        device.add(new Klawiatura());
        device.add(new Mysz());
        device.add(new Dysk());

        for (Object o : device) {
            System.out.println("Urządzenie: " + o.getClass().getName());
            List<Class<?>> interfaces = Arrays.asList(o.getClass().getInterfaces());

            if (interfaces.contains(PS2.class)) {
                PS2 ps2 = (PS2)o;
                ps2.connectPS2();
            }
            if (interfaces.contains(USB.class)) {
                ((USB)o).connectUSB();
            }
            if (interfaces.contains(SATA.class)) {
                ((SATA)o).connectSATA();
            }
        }
    }
}
