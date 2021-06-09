package ru.netology;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "The challenge is to write an Aboriginal dictionary generator in a functional style. " +
                "Imagine that you have the source text of a local person's message." +
                " The program should break the text into words and sort them in the natural order." +
                " In the comments, specify what distinctive features of the functional style are present in your program.";

        List<String> dictionary = Arrays.stream(text.replaceAll("\\p{Punct}","").split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Словарь: ");
        dictionary.forEach(System.out::println);
    }
}