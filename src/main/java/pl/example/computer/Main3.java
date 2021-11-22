package pl.example.computer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<String> alfabet = new ArrayList<>();
        alfabet.add("b");
        alfabet.add("aaaa");
        alfabet.add("c");

        System.out.println(alfabet.contains("aaaa"));
        Collections.sort(alfabet);

        alfabet.forEach(System.out::println);

    }

}
