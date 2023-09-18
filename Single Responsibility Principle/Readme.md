# Single Responsibility Principle (SRP) in Java

This repository provides an explanation of the Single Responsibility Principle (SRP) and demonstrates its application in Java programming.

## Table of Contents

1. [Single Responsibility Principle Overview](#single-responsibility-principle-overview)
2. [SRP in Java](#srp-in-java)
3. [Example](#example)
4. [Best Practices](#best-practices)
5. [Contributing](#contributing)
6. [License](#license)

## Single Responsibility Principle Overview

The Single Responsibility Principle (SRP) is one of the SOLID principles of object-oriented design. It states that a class should have only one reason to change. In other words, a class should have a single responsibility or job. This principle encourages modular and maintainable code by promoting separation of concerns.

## SRP in Java

In Java, adhering to SRP involves ensuring that each class or module has a well-defined and single responsibility. This means that the class should encapsulate and handle only one aspect or concern of the application.

### Benefits of SRP in Java:

- **Enhanced Readability:** Classes with a single responsibility are easier to understand and maintain.
- **Improved Testability:** Smaller, focused classes are typically easier to test in isolation.
- **Easier Maintenance:** Changes in one responsibility do not impact other unrelated responsibilities.
- **Code Reusability:** Single-responsibility classes can often be reused in various parts of the application.

## Example

In this repository, you will find a Java example that illustrates the Single Responsibility Principle. We have created a simple example with two classes, each adhering to a single responsibility:

- `Order` class: Responsible for managing order-related functionality.
- `Invoice` class: Responsible for generating and managing invoices.

You can explore the code and see how each class has a clearly defined responsibility.

## Best Practices

Here are some best practices to follow when applying SRP in Java:

1. **Identify Responsibilities:** Clearly define the responsibilities of each class or module.
2. **Separate Concerns:** Ensure that each class or module focuses on a specific concern and does not mix unrelated functionality.
3. **Refactor as Needed:** If a class becomes too complex or starts handling multiple responsibilities, consider refactoring it into smaller, more focused classes.
4. **Unit Testing:** Write unit tests to ensure that each class behaves correctly in isolation.

## Contributing

If you would like to contribute to this repository by adding more examples, improving documentation, or suggesting best practices related to SRP in Java, please follow our [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
