package com.epam.entity;

import java.util.List;

public class Sentence {
    private List<Word> sentence;

    private String sentenceString;

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public Sentence(String sentenceString) {
        this.sentenceString = sentenceString;
    }

    public Sentence() {
    }

    public String getSentenceString() {
        return sentenceString;
    }

    public void setSentenceString(String sentenceString) {
        this.sentenceString = sentenceString;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }
}
