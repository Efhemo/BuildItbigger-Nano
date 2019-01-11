package com.efhemo.jokeslibrary;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyJokes {

    List<String> list = asList("First Joke",
            "second joke",
            "third joke",
            "fourth joke",
            "fifth joke",
            "sixth joke");

    public String getMyJoke(){

        Random random = new Random();

        return list.get(random.nextInt(list.size()));
    }

}
