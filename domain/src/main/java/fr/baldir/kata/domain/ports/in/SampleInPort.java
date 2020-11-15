package fr.baldir.kata.domain.ports.in;

import fr.baldir.kata.domain.Greetings;

/**
 * A port at the left side of the hexagon. Usually it will capture user inputs or any event or command (Rest endpoint,
 * CLI, messaging listener ...)
 * To be implemented in the "application" module.
 * @see <a href="Architecture Hexagonale : trois principes et un exemple d’implémentation">Architecture Hexagonale :
 * trois principes et un exemple d’implémentation</a>
 */
public interface SampleInPort {
    void greet(Greetings greetings);
}
