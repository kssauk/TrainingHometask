package com.epam.reader;

import com.epam.entity.Sentence;

import java.io.BufferedReader;
import java.io.IOException;

public interface Reader {

    Sentence read() throws IOException;
}
