package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class RusAlphabetGame extends AbstractGame{
    @Override
    ArrayList<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".split("")));
    }
}
