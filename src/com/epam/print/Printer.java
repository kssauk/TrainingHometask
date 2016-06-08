package com.epam.print;

import com.epam.entity.Sentence;

public class Printer {

    private static final String SENTENCE = "Sentence - ";

    private static final String WORDS = "Words - ";

    private static final String SENTENCE_IS_EMPTY = "Sentence is empty";

    private static final String ENTER_STRING = "Enter string, please";

    private static final String ENTER_CORRECT_NUMBER = "Enter correct number, please";

    private static final String ENTER_FILE_PATH = "Enter file path, please (For example : C:\\Users\\PC\\IdeaProjects\\TrainingHometask\\file.txt)";

    public static void printSentenceString(Sentence sentence) {
        if (sentence.getSentenceString() != null && sentence.getSentenceString().trim() != "") {
            System.out.println(SENTENCE + sentence.getSentenceString());
        } else {
            System.out.println(SENTENCE_IS_EMPTY);
        }
    }

    public static void printSentenceWords(Sentence sentence) {
        if (sentence.getSentence() != null) {
            System.out.println(WORDS);
            sentence.getSentence().forEach(s -> System.out.print(s.getWord() + " "));
            System.out.println();
        } else {
            System.out.println(SENTENCE_IS_EMPTY);
        }
    }

    public static void printAfterInputStringMessage() {
        System.out.println(ENTER_STRING);
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
        System.out.println(ENTER_CORRECT_NUMBER);
    }

    public static void printAfterInputFilePathMessage() {
        System.out.println(ENTER_FILE_PATH);
    }
}
