# kata-hexagonal-starter

Java starter for modular (jigsaw) enforced implementation  of an hexagonal architecture.

In this kata, you will first implement core domain logic in TDD. You can save your progress since the purpose of the kata is not the domain itself but to prove how to separate application / infrastructure / core domain. 

Patterns that may be encountered

- [Domain Model](https://martinfowler.com/eaaCatalog/domainModel.html)
- [Repository](https://www.martinfowler.com/eaaCatalog/repository.html)
- [InMemoryTestDatabase](https://martinfowler.com/bliki/InMemoryTestDatabase.html)

Practices that may occur

- [Test Driven Development](https://martinfowler.com/bliki/TestDrivenDevelopment.html)
- [GivenWhenThen style](https://martinfowler.com/bliki/GivenWhenThen.html)
- [Behaviour-Driven Development (BDD)](https://dannorth.net/introducing-bdd/)
- [Domain-Driven-Design]()



## Some ideas from this starter

- Implement ArchUnit Rules to check the hexagonal architecture is well enforced.
- implement a cli
- implement a reactive API
- implement a rest API
- implement a soap API
- implement a heavy standalone client
- implement a serverless function
- evolving the domain given multiple applications / infrastructure modules
- Migrate from Spring Application / infrastructure to Quarkus Application / infrastructure
- Migrate core domain to kotlin and export it to target javascript

## External

Inspired by https://github.com/dstr89/hexagonal-java-modules


## Jigsaw FAQ

- Why do I get `java.lang.reflect.InaccessibleObjectException: Unable to make xyz.XXXTest() accessible` when running 
  tests with maven?
    - You must either make Test classes and test methods public (so that Jupiter do not need to use reflection)
    - Or you can add argument to your maven-surefire-plugin to open your module/package to reflection
        ```xml
        <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <configuration>
                    <argLine>--add-opens fr.baldir.kata.application/fr.baldir.kata.application=ALL-UNNAMED</argLine>
                </configuration>
            </plugin>
        </plugins>
        </build>
        ```
    - [](https://stackoverflow.com/a/53462763)