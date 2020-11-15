package fr.baldir.kata.application;

import fr.baldir.kata.domain.ports.out.GreeterOutPort;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleAppTest {
    private static class QueueConsoleScanner implements ConsoleScanner {
        private Queue<String> commands = new ArrayDeque<>();

        @Override
        public Optional<String> nextLine() {
            if (!commands.isEmpty())
                return Optional.of(commands.remove());
            return Optional.empty();
        }

        void addCommand(String command) {
            commands.add(command);
        }
    }

    class Result {
        public String actualGreetingOutput;
    }

    @Test
    void greet_someone_and_then_exit() throws IOException {
        final Result greetingOutput = new Result();

        try (var outputStream = new ByteArrayOutputStream();
             var printStream = new PrintStream(outputStream)) {

            //Given
            // Inputs that will be given
            final var consoleScanner = new QueueConsoleScanner();
            consoleScanner.addCommand("g");
            consoleScanner.addCommand("Konzinov");

            //Spy for the argument and store it in the result Structure
            final GreeterOutPort greeterOutPortSpy = greetings ->
                    greetingOutput.actualGreetingOutput = "Greeting output = " + greetings.greetee();

            // Inject with fake infrastructure (Because application module do not depend on infrastructure)
            var consoleApp = new ConsoleApp(
                    consoleScanner,
                    //Spy
                    greeterOutPortSpy,
                    printStream);

            //When
            consoleApp.waitForCommand();

            //Then
            assertThat(greetingOutput.actualGreetingOutput).isEqualTo("Greeting output = Konzinov");
            assertThat(outputStream.toString()).isEqualToNormalizingNewlines(
                    "Enter G to greet or E to exit the application: \n" +
                            "Enter the name of the person you want to greet: \n" +
                            "Enter G to greet or E to exit the application: \n");
        }
    }
}