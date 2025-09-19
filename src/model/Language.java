package model;

import java.util.ArrayList;
import java.util.List;

public class Language {
    public static final List<String> KEYWORDS = new ArrayList<String>(
            List.of("auto", "break", "case", "char", "const", "continue", "default", "do",
                    "double", "else", "enum", "extern", "float", "for", "goto", "if", "int", "long",
                    "register", "return", "short", "signed", "sizeof", "static", "struct", "switch",
                    "typedef", "union", "unsigned", "void", "volatile", "while")
    );
    public static final List<Character> NOT_ALLOWED_DELIMITERS = new ArrayList<Character>(
            List.of('+', '-', '*', '/', '%', '<', '>', '=', '!', '&', '|', '^', '~',
                    '(', ')', '[', ']', '{', '}', ';', ',', '.', ':', '"', ' ', '\t', '\n', '\r',
                    '?', '#', '@', '¬', '¡', '¿', '°', '´', '¨', '`')
    );
}
