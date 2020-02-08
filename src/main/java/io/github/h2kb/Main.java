package io.github.h2kb;

import io.github.h2kb.parser.Parser;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String filePathName = "./src/main/resources/cars.json";
        File file = new File(filePathName);

        Parser parser = new Parser();
        parser.parse(file);
    }
}
