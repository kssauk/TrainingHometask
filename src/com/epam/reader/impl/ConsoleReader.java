package com.epam.reader.impl;

import com.epam.entity.Sentence;
import com.epam.print.Printer;
import com.epam.reader.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scan = new Scanner(System.in);

    @Override
    public Sentence read() {
        Printer.printAfterInputStringMessage();
        Sentence sentence = new Sentence(scan.nextLine());
        return sentence;
    }
}
