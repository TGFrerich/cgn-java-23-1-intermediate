package org.example;

import java.util.ArrayList;
import java.util.List;

public class Woerterbuch {

    private List<String> liste = new ArrayList<>();

    public void addMethod(String word){
        liste.add(word);
    }

    public List<String> getListe() {
        return liste;
    }

    @Override
    public String toString() {
        return "Woerterbuch{" +
                "liste=" + liste +
                '}';
    }
}
