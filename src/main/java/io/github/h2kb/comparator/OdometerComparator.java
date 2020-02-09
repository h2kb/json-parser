package io.github.h2kb.comparator;

import io.github.h2kb.entity.Car;

import java.util.Comparator;

public class OdometerComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getOdometer() == car2.getOdometer()) {
            return 0;
        }
        if (car1.getOdometer() > car2.getOdometer()) {
            return 1;
        }

        return -1;
    }
}
