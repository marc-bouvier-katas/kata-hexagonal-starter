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