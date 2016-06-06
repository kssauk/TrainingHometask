package com.epam;

import com.epam.entity.Sentence;
import com.epam.menu.Menu;
import com.epam.print.Printer;

import java.io.IOException;

public class Main {

    private static Menu menu = new Menu();

    public static void main(String[] args) throws IOException {
        Sentence sentence = menu.checkReader();

        menu.checkAction(sentence);

        Printer.printSentenceString(sentence);

        Printer.printSentenceWords(sentence);
    }
}
