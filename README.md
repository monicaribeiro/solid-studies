# SOLID Principles
_This repository has an educational purpose._

##Introduction
The principles that make up **SOLID** first appeared in an article called Principles Of OOD, published in 2000 by **Robert Martin**. The author talks about object-oriented programming techniques and code design, and in 2004 Michael Feathers reorganized the principles with the initial of each name and formed the acronym SOLID.

Given that, it stands for:
* **S**ingle-responsiblity Principle
* **O**pen-closed Principle
* **L**iskov Substitution Principle
* **I**nterface Segregation Principle
* **D**ependency Inversion Principle

##Repository Structure

Inside the `java` folder, there is a folder for each principle:
```
solid-studies
│   README.md
│   pom.xml    
│
└───source
│   └───main
│      └───java
│          │   singleReponsibilityPrinciple/
│          │   openClosePrinciple/
│          │   liskovSubstitutionPrinciple/
│          │   interfaceSegregationPrinciple/
│          │   dependencyInversionPrinciple/
│   
└───test
```

In the `main` branch the codes are not refactored, that is, they do not follow best practices. So, if you want to do a refactoring exercise, just start from that branch.

On the `solid-principles-applied` branch are, as its name refers, the same codes, but refactored applying what each principle values.

> **_NOTE:_**  Something important to keep in mind that this is not an **exact science**. Maybe a week from now I'll see that I could refactor my different code to make it even more readable. So, probably you'll find something that you would do different ¯\_(ツ)_/¯ As Brazilians would say: "é sobre isso, e tá tudo bem".

Let's walk through the principles, one by one:

## Single Responsibility Principle
> _A class should have one, and only one, reason to change._

Every module should have one single responsibility. This means two separate concerns/responsibilities/tasks should always be implemented in separate modules. Robert C. Martin defines a “responsibility” as a “reason to change”. If a module has several responsibilities, there are several reasons to change this module—namely the requirements for each responsibility may change. On the other hand a reason to change a module also means that it is the responsibility of the module to implement the aspect that is changed.

Depending on whether a module in the given context is a class, a method, a library, etc. (i.e. the level of abstraction), the granularity of what is seen as a responsibility may differ. ([article-principles-wiki-srp])

Separating responsibilities well is closely linked with the term loosely coupling (instead of having tight coupling).

**Tight Coupling**
- Classes are highly dependent on one another.
- This typically happens when the classes have **too many responsibilities**.

**Loosely Coupling**

- Classes are independent of each other.
- Interfaces (abstractions) are quite powerful tools to achieve this feature.
- It can be done with the help of the SOLID principles.

   [video-uncle-bob-solid-principles]: https://www.youtube.com/watch?v=zHiWqnTWsn4&ab_channel=FucktheCommunism
   [article-medium-backticks]: https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898
   [article-principles-wiki-srp]: http://principles-wiki.net/principles:single_responsibility_principle
