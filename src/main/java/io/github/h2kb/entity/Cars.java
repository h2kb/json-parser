package io.github.h2kb.entity;

import java.util.Arrays;
import java.util.List;

public class Cars {

    protected Car[] cars;

    @Override
    public String toString() {
        return Arrays.toString(cars);
    }

    public List<Car> getArr() {
        return Arrays.asList(cars);
    }
}
