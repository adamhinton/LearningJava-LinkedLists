package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Can be declared exactly like an AL
//        LinkedList<String> placesToVisit = new LinkedList<>();

        // Can also decl w. var
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
    }
}