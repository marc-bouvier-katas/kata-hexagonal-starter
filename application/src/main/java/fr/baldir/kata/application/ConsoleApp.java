package fr.baldir.kata.application;

import fr.baldir.kata.domain.Greetings;
import fr.baldir.kata.domain.ports.out.GreeterOutPort;

import java.io.PrintStream;

import static fr.baldir.kata.application.CommandEvent.CONTINUE;
import static fr.baldir.kata.application.CommandEvent.EXIT;

/**
 * Console prompt for greeting.
 */
public class ConsoleApp {

    private static final String ACTION_GREET = "G";
    private static final String ACTION_EXIT = "E";

    // Concrete dependencies are provided by infrastructure
    private final ConsoleScanner consoleScanner;
    private final GreeterOutPort greeterOutPort;
    private final PrintStream printStream;

    public ConsoleApp(
            ConsoleScanner consoleScanner, GreeterOutPort greeterOutPort, PrintStream printStream) {

        this.consoleScanner = consoleScanner;
        this.greeterOutPort = greeterOutPort;
        this.printStream = printStream;
    }

    public void waitForCommand() {
        while (true) {
            final var nextEvent = askForCommand();
            if (nextEvent == EXIT) {
                return;
            }
        }
    }

    private CommandEvent askForCommand() {
        printStream.println("Enter G to greet or E to exit the application: ");
        return consoleScanner.nextLine().map(command -> {
            switch (command.toUpperCase()) {
                case ACTION_GREET:
                    printStream.println("Enter the name of the person you want to greet: ");
                    consoleScanner.nextLine()
                            .ifPresent(name -> greeterOutPort.greet(new Greetings(name)));

                    return CONTINUE;
                case ACTION_EXIT:
                    //exits
                    return EXIT;
                default:
                    return CONTINUE;
            }
        }).orElse(EXIT);
    }
}


