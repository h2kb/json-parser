package io.github.h2kb.parser;

import com.google.gson.Gson;

import io.github.h2kb.comparator.OdometerComparator;
import io.github.h2kb.comparator.YearComparator;
import io.github.h2kb.entity.Car;
import io.github.h2kb.entity.Cars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Parser {
    private Gson gson = new Gson();
    Comparator<Car> comparator = new YearComparator().thenComparing(new OdometerComparator());

    public void parse(File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);

        ArrayList<Car> cars = gson.fromJson(reader, Cars.class).cars;
        cars.sort(comparator);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
