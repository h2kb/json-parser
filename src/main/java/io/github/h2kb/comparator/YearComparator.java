package io.github.h2kb.comparator;

import io.github.h2kb.entity.Car;

import java.util.Comparator;

public class YearComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getYear() == car2.getYear()) {
            return 0;
        }
        if (car1.getYear() > car2.getYear()) {
            return 1;
        }

        return -1;
    }
}
