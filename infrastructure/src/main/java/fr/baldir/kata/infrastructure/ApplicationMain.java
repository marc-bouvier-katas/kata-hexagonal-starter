package fr.baldir.kata.infrastructure;

import fr.baldir.kata.application.ConsoleApp;

import java.util.Scanner;

//Scaffolding and runner of the application
public class ApplicationMain {
    public static void main(String[] args) {
        //Configuration
        final var consoleApp = new ConsoleApp(
                new InputStreamConsoleScanner(
                        new Scanner(System.in)), new PrintStreamGreeterOutAdapter(System.out), System.out);

        consoleApp.waitForCommand();
    }
}
