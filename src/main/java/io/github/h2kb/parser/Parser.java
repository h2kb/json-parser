package io.github.h2kb.parser;

import com.google.gson.Gson;

import io.github.h2kb.entity.Car;
import io.github.h2kb.entity.Cars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.List;

public class Parser {
    private Gson gson = new Gson();

    public void parse(File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);

        Cars cars = gson.fromJson(reader, Cars.class);
        List<Car> carArrays = cars.getArr();

        for (Car car : carArrays) {
            System.out.println(car);
        }
    }
}
