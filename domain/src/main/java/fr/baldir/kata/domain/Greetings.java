package fr.baldir.kata.domain;

public class Greetings {

    private final String greetee;

    public Greetings(String greetee) {
        this.greetee = greetee;
    }

    public String greetee() {
        return greetee;
    }
}