package fr.baldir.kata.infrastructure;

import fr.baldir.kata.domain.Greetings;
import fr.baldir.kata.domain.ports.out.GreeterOutPort;

import java.io.PrintStream;

public class PrintStreamGreeterOutAdapter implements GreeterOutPort {

    private final PrintStream printStream;

    PrintStreamGreeterOutAdapter(PrintStream printStream) {

        this.printStream = printStream;
    }

    @Override
    public void greet(Greetings greetings) {
        printStream.println("Hello "+ greetings.greetee());
    }
}
