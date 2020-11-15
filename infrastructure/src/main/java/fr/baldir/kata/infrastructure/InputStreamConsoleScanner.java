package fr.baldir.kata.infrastructure;

import fr.baldir.kata.application.ConsoleScanner;

import java.util.Optional;
import java.util.Scanner;

public class InputStreamConsoleScanner implements ConsoleScanner {
    private final Scanner scanner;

    public InputStreamConsoleScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Optional<String> nextLine() {
        if (scanner.hasNext()) {
            return Optional.of(scanner.nextLine());
        }
        return Optional.empty();
    }
}
