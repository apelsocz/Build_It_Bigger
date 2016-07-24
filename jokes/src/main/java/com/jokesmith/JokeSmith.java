package com.jokesmith;

import java.util.Random;

public class JokeSmith {
    public String getJoke() {
        String[] jokes = new String[] {
                "Programmer (noun):\n\nA machine that turns coffee into code",
                "Algorithm (noun):\n\nA word used by programmers when they do not want to explain what they did",
                "Q: What do you call a programmer from Finland?\n\nA: Nerdic",
                "Q: Where is a programmer's favorite place to hangout?\nA: Foo Bar",
                "Q: Why did the programmer quit his job?\n\nA: Because he didn't get arrays",
                "Q: 0 is false and 1 is true, right?\n\nA: 1",
                "Q: Why do Java programmers have to wear glasses?\n\nA: Because they do not C#",
                "99 bugs in the code,\n99 bugs in the code,\nfix 1 bug ... compile again,\n101 bugs in the code",
                "Hide and seek champion...\n;\nsince 1958",
                "['hip','hip']"
        };
        return jokes[new Random().nextInt(jokes.length)];
    }
}