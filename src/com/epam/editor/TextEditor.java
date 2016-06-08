package com.epam.editor;

import com.epam.entity.Sentence;
import com.epam.entity.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextEditor {

    private static final String PATTERN = "[^a-zA-Zа-яА-Я ]";

    public static void deleteNonWordsCharacters(Sentence sentence) {
        String editedSentence = sentence.getSentenceString().replaceAll(PATTERN, "");
        sentence.setSentenceString(editedSentence);
    }

    public static void addingMinimumOneSpace(Sentence sentence) {
        String editedSentence = sentence.getSentenceString().replaceAll(" +", " ").trim();
        sentence.setSentenceString(editedSentence);
    }

    public static void splitTextToWords(Sentence sentence) {
        List<String> strings = new ArrayList<>(Arrays.asList(sentence.getSentenceString().split(" ")));
        List<Word> words = new ArrayList<>();
        strings.forEach(s -> words.add(new Word(s)));
        sentence.setSentence(words);
    }
}
