package com.project.krishna.javajokelib;

import java.util.Random;

public class MyJokes {

    private static final String[] JOKELIST = {
            "Maybe if we start telling people the brain is an app they will start using it.",
            "I need more than 140 characters to tell you how beautiful you are.",
            "You must be an angel, because your texture mapping is so divine!",
            "Moses had the first tablet that could connect to the cloud.",
            "Is your name Wi-Fi? Because I'm feeling a connection.",
            "I was going to be a computer forensics expert, but couldn't hack IT.",
            "Every function without you will always be void of love.",
            "Is Google male or female? Female, because it doesn't let you finish a sentence before making a suggestion",

    };

    private static final Random random = new Random();

    public static String getJoke() {
        return JOKELIST[random.nextInt(JOKELIST.length)];
    }

}
