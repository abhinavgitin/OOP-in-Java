# OOP in Java Learning Journal

This repository is my personal space to practice and understand Object-Oriented Programming (OOP) in Java. I push examples as I learn, experiment, and refine my understanding. The code favors clarity and learning over perfection.

> This is a learning repository. Concepts evolve, files may be reorganized, and comments often explain “why” as much as “what.”

---

## Table of Contents

- [About This Repository](#about-this-repository)
- [What’s Covered (from current code)](#whats-covered-from-current-code)
- [Repository Overview](#repository-overview)
- [How to Run](#how-to-run)
- [Key Learnings and Notes](#key-learnings-and-notes)
  - [Objects, Properties, and Access](#objects-properties-and-access)
  - [Constructors](#constructors)
  - [Static vs Non-Static](#static-vs-non-static)
  - [Inner Classes (Static and Non-Static)](#inner-classes-static-and-non-static)
  - [Singleton Pattern](#singleton-pattern)
  - [Packages and Imports](#packages-and-imports)
- [Roadmap](#roadmap)
- [Resources](#resources)
- [Contributing](#contributing)
- [License](#license)

---

## About This Repository

- Goal: Learn OOP concepts using small, focused Java files.
- Approach: Create objects, call methods, experiment with constructors and access, use static vs non-static, practice patterns like Singleton, and document findings.
- Language: 100% Java.

---

## What’s Covered (from current code)

The topics below are taken directly from the current files in this repository:

- Object creation and property access, reference variables, and printing values
  - [src/Part1/Main.java](src/Part1/Main.java)
- Constructors:
  - No-arg constructor with default values
  - Parameterized constructor
  - Copy constructor (copy from another object)
  - Constructor with multiple object parameters to combine data
  - Calling one constructor from another (constructor chaining)
  - [src/Part1/Main.java](src/Part1/Main.java)
- Using `this` for clarity and object context
  - [src/Part1/Main.java](src/Part1/Main.java), [src/Part1/Main2.java](src/Part1/Main2.java)
- Static vs Non-Static:
  - Static fields shared across objects
  - Static methods and when they can/can’t access non-static members
  - Static initialization blocks (run once when class loads)
  - Static inner classes vs non-static inner classes
  - [src/Part2/StaticClass/Human.java](src/Part2/StaticClass/Human.java)
  - [src/Part2/StaticClass/Main.java](src/Part2/StaticClass/Main.java)
  - [src/Part2/StaticClass/StaticInz.java](src/Part2/StaticClass/StaticInz.java)
  - [src/Part2/StaticClass/InnerClasses.java](src/Part2/StaticClass/InnerClasses.java)
  - [src/Part2/StaticClass/CallMatrixExplained.java](src/Part2/StaticClass/CallMatrixExplained.java)
- Singleton pattern (ensuring only one instance exists)
  - [src/Part2/SingleTon/Singleton.java](src/Part2/SingleTon/Singleton.java)
  - [src/Part2/SingleTon/Main.java](src/Part2/SingleTon/Main.java)
- Basic packaging and imports, static import usage
  - [src/Part2/Output.java](src/Part2/Output.java)
  - [src/Part2/Returner.java](src/Part2/Returner.java)

Note: Some `main` methods are intentionally customized (e.g., `static void main()` without `public` or `String[] args`) to focus on concept execution rather than standard Java application entry points.

---

## Repository Overview

A simplified view of structure and purpose:

```
OOP-in-Java/
└─ src/
   ├─ Main.java                          # Simple entry snippet (concept demo)
   ├─ Part1/
   │  ├─ Main.java                       # Objects, property access, constructors, copying, combining
   │  └─ Main2.java                      # Using this, printing values, constructor behavior
   └─ Part2/
      ├─ Output.java                     # Static import usage, calling methods across classes
      ├─ Returner.java                   # Utility method (calc) and a print main
      ├─ SingleTon/
      │  ├─ Main.java                    # Demonstrating singleton retrieval
      │  └─ Singleton.java               # Singleton implementation
      └─ StaticClass/
         ├─ Main.java                    # Using static fields/methods and instance data
         ├─ Human.java                   # Static field (population), non-static method calls
         ├─ StaticInz.java               # Static block initialization and ordering
         ├─ InnerClasses.java            # Static inner class vs outer class behavior
         └─ CallMatrixExplained.java     # Clear matrix: who can call what (static vs non-static)
```

This layout reflects learning modules rather than a single runnable app.

---

## How to Run

Because many files are concept-focused and have custom `main` signatures, treat them as learning snippets. You can run them in an IDE (like IntelliJ IDEA or VS Code with Java extensions) by:

- Opening a file.
- Temporarily converting `static void main()` to the standard signature:
  - `public static void main(String[] args)` or `public static void main(String... args)`
- Or create a small runner that calls the class methods you want to see.

Example using `javac/java` from project root:

```bash
# Compile all sources into out/ directory
javac -d out $(find src -name "*.java")

# Run a specific class that has a standard main
# For example, if you change CallMatrixExplained.main to public static void main(String[] args)
java -cp out Part2.StaticClass.CallMatrixExplained
```

Tip: If you want a single entry-point, add a launcher class that invokes specific demos:
```java
public class Runner {
    public static void main(String[] args) {
        Part2.StaticClass.CallMatrixExplained.main(args);
        Part2.StaticClass.StaticInz.main();
        Part2.StaticClass.Main.main();
        Part2.SingleTon.Main.main();
        Part2.Output.main();
        Part1.Main2.main(new String[0]);
        // etc...
    }
}
```

---

## Key Learnings and Notes

### Objects, Properties, and Access
- Create objects and access their fields via `object.field`.
- Reference variables point to objects; multiple objects can share the same class properties but hold different values.
- See: `Part1/Main.java`.

### Constructors
- Parameterized constructor assigns provided values to instance variables.
- No-arg constructor sets defaults for all new objects.
- Copy constructor duplicates another object's state.
- Constructor combining two `Student` objects merges values from both.
- Constructor chaining: calling one constructor from another to reuse initialization.
- See: `Part1/Main.java`.

### Static vs Non-Static
- Static fields belong to the class, not the object (e.g., `Human.population`).
- Static methods don’t have an object (`this`) and can’t directly access non-static members.
- Non-static methods have `this` and can access both non-static and static members.
- Static initialization blocks run once when the class is loaded—useful for computed defaults.
- See: `Part2/StaticClass/Human.java`, `StaticInz.java`, `Main.java`.

### Inner Classes (Static and Non-Static)
- Static inner class: independent of outer class object; can be used without an outer instance.
- Non-static inner class: requires an outer class instance to be created.
- From static context, you must first create an outer object to create a non-static inner instance.
- The “Call Matrix” clarifies allowed calls from static vs non-static methods.
- See: `Part2/StaticClass/InnerClasses.java`, `CallMatrixExplained.java`.

### Singleton Pattern
- Ensures only a single instance of a class exists.
- Private constructor + private static instance + public static accessor (`getInstance()`).
- Multiple calls to `getInstance()` return the same object.
- See: `Part2/SingleTon/Singleton.java`, `Main.java`.

### Packages and Imports
- Basic packaging demonstrated with `Part1` and `Part2` subpackages.
- Static import usage: `import static Part2.Returner.calc;` to call `calc` without class prefix.
- See: `Part2/Output.java`, `Part2/Returner.java`.

---

## Roadmap

This tracks what I plan to learn next and improve:

- [ ] Add standard `public static void main(String[] args)` entry points to selected demos for easy CLI runs
- [ ] More examples for encapsulation with getters/setters
- [ ] Exception handling patterns and best practices
- [ ] Collections and Generics basics (List, Map, Set)
- [ ] Java Streams for simple transformations
- [ ] Unit tests (JUnit) for selected classes
- [ ] Refactor some examples for consistency and readability
- [ ] Add comments explaining tricky points (constructor chaining, `this`, static blocks)

---

## Resources

- [Official Java Documentation](https://docs.oracle.com/javase/)
- [Effective Java (Joshua Bloch)](https://www.oreilly.com/library/view/effective-java-3rd/9780134686097/)
- [Refactoring Guru — Design Patterns](https://refactoring.guru/design-patterns)
- [JUnit 5](https://junit.org/junit5/)

---

## Contributing

This is a learning repo. If you notice a clearer approach or a helpful tip, feel free to open an issue or PR. Feedback helps me learn faster.

---

## License

Educational use. A formal license may be added later.
