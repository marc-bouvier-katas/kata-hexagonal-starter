package fr.baldir.kata.domain.ports.out;

import fr.baldir.kata.domain.Greetings;

/**
 * A port at the right side of the hexagon (usually for persistence, IO, event publication, rest clients)
 * To be implemented in the "infrastructure" module.
 * @see <a href="https://blog.octo.com/architecture-hexagonale-trois-principes-et-un-exemple-dimplementation/">
 *     Architecture Hexagonale : trois principes et un exemple d’implémentation</a>
 */
public interface GreeterOutPort {
    void greet(Greetings greetings);
}
