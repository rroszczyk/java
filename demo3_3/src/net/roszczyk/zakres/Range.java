package net.roszczyk.zakres;

import java.util.Iterator;

public class Range implements Iterable<Integer>, Iterator<Integer> {
    private Integer max;
    private Integer current;
    public Range(Integer min, Integer max)
    {
        this.current = min;
        this.max = max;
    }
    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
    @Override
    public boolean hasNext() {
        return current < max;
    }
    @Override
    public Integer next() {
        return current++;
    }
}
