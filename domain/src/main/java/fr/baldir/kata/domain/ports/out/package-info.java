/**
 * The right side of the hexagon. Usually it will export ports for outputs (persistence, IO, event publication, rest
 * clients, notifications). To be implemented as adapters in the "infrastructure" module.
 * <br/><br/>
 * <p>
 * This differentiation between in (left) and out (right) highlight the Left-Right Assymetry that is not visible in the
 * Ports and adapters pattern.
 *
 * @see <a href="https://web.archive.org/web/20180822100852/http://alistair.cockburn.us/Hexagonal+architecture">
 * Hexagonal Architecture - The Left-Right Asymmetry</a>
 */
package fr.baldir.kata.domain.ports.out;