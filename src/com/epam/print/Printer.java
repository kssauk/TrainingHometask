package com.epam.print;

import com.epam.entity.Sentence;

public class Printer {

    public static void printSentenceString(Sentence sentence) {
        if (sentence.getSentenceString() != null) {
            System.out.println("Sentence - " + sentence.getSentenceString());
        } else {
            System.out.println("Sentence is empty");
        }
    }

    public static void printSentenceWords(Sentence sentence) {
        if (!sentence.getSentence().isEmpty()) {
            System.out.println("Words - " + sentence.getSentenceString());
        } else {
            System.out.println("Sentence is empty");
        }
    }

    public static void printAfterInputStringMessage() {
        System.out.println("Please, enter string");
    }

    public static void printReaderMenuConditions() {
        System.out.println("1 - Read text from console");
        System.out.println("2 - Read text from file");
    }

    public static void printActionMenuConditions() {
        System.out.println("1 - Delete all non-alphobite letters");
        System.out.println("2 - Fixed spaces");
        System.out.println("3 - Split text to words");
        System.out.println("4 - Enter new word");
        System.out.println("0 - Exit");
    }

    public static void printMenuError() {
        System.out.println("Please, enter correct number");
    }

    public static void printAfterInputFilePathMessage() {
        System.out.println("Please, enter file path (For example : D:\\Document.doc)");
    }
}
