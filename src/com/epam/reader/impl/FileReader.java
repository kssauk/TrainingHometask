package com.epam.reader.impl;

import com.epam.entity.Sentence;
import com.epam.print.Printer;
import com.epam.reader.Reader;

import java.io.*;
import java.util.Scanner;

public class FileReader implements Reader {
    private Scanner scan = new Scanner(System.in);

    @Override
    public Sentence read() throws IOException {
        Printer.printAfterInputFilePathMessage();

        File fileDir = new File(scan.nextLine());

        StringBuffer text;
        Sentence sentence;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir)))) {
            text = new StringBuffer();
            String line;
            while ((line = in.readLine()) != null) {
                text.append(line + "\n");
            }

            in.close();
        }
        sentence = new Sentence(text.toString());

        return sentence;
    }
}
