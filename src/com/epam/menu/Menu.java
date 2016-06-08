package com.epam.menu;

import com.epam.editor.TextEditor;
import com.epam.entity.Sentence;
import com.epam.print.Printer;
import com.epam.reader.Reader;
import com.epam.reader.impl.ConsoleReader;
import com.epam.reader.impl.FileReader;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Scanner scan = new Scanner(System.in);

    private TextEditor textEditor = new TextEditor();

    private Reader reader;

    private static final String ENTER_CORRECT_NUMBER = "Enter correct number, please";

    public Sentence checkReader() throws IOException {
        Printer.printReaderMenuConditions();

        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                reader = new ConsoleReader();
                break;
            case "2":
                reader = new FileReader();
                break;
            default:
                System.out.println(ENTER_CORRECT_NUMBER);
                checkReader();
                break;
        }
        return reader.read();
    }

    public Sentence checkAction(Sentence sentence) throws IOException {
        Printer.printActionMenuConditions();

        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                textEditor.deleteNonWordsCharacters(sentence);
                Printer.printSentenceString(sentence);
                checkAction(sentence);
                break;
            case "2":
                textEditor.addingMinimumOneSpace(sentence);
                Printer.printSentenceString(sentence);
                checkAction(sentence);
                break;
            case "3":
                textEditor.splitTextToWords(sentence);
                Printer.printSentenceWords(sentence);
                checkAction(sentence);
                break;
            case "4":
                checkAction(checkReader());
                break;
            case "0":
                System.exit(0);
                break;
            default:
                Printer.printMenuError();
                checkAction(sentence);
                break;
        }
        return sentence;
    }
}
