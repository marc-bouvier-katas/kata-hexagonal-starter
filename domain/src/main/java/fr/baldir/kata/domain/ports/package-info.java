/**
 * This package contains ports (API) that are exposed by the core domain.
 * Those interfaces describe how the domain expects the outside to communicate with the domain.
 *
 * The infrastructure will need to implement those ports as concrete Adapters.
 *
 * <br/><br/>
 * <p>
 * E.g. A Repository (port) may have an InMemoryRepositoryAdapter implementation for testing purposes and a
 * MariaDbRepositoryAdapter implementation for production
 * </p>
 * @see <a href="https://web.archive.org/web/20180822100852/http://alistair.cockburn.us/Hexagonal+architecture">
 *     Hexagonal architecture</a>
 */
package fr.baldir.kata.domain.ports;