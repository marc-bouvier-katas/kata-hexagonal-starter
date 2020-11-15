import fr.baldir.kata.domain.ports.out.GreeterOutPort;

module fr.baldir.kata.application {
    requires fr.baldir.kata.domain;


    exports fr.baldir.kata.application;

    uses GreeterOutPort;
}