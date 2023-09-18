# Liskov Substitution Principle (LSP) in Java

This repository provides an explanation of the Liskov Substitution Principle (LSP) and demonstrates its application in Java programming.

## Table of Contents

1. [Liskov Substitution Principle Overview](#liskov-substitution-principle-overview)
2. [LSP in Java](#lsp-in-java)
3. [Example](#example)
4. [Best Practices](#best-practices)
5. [Contributing](#contributing)

## Liskov Substitution Principle Overview

The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented design. It states that objects of a derived class must be substitutable for objects of the base class without affecting the correctness of the program. In other words, a derived class should extend the behavior of its base class without altering its contract.

## LSP in Java

In Java, adhering to the Liskov Substitution Principle means that subclasses should adhere to the same interface as their parent class and should not violate the behavior expected from the base class. This principle is crucial for ensuring that polymorphism works correctly in Java.

### Benefits of LSP in Java:

- **Polymorphism:** Allows for the use of base class references to manipulate derived class objects, promoting code reusability and flexibility.
- **Interchangeability:** Subclasses can be used interchangeably with their parent class without unexpected side effects.
- **Maintainability:** Easier maintenance and extension of the codebase due to adherence to contracts.

## Example

In this repository, you will find a Java example that illustrates the Liskov Substitution Principle. We have created a simple example with a base class `Shape` and two derived classes, `Circle` and `Rectangle`, that adhere to LSP:

- `Shape` class: The base class that defines a common interface for all shapes.
- `Circle` class: A derived class representing a circle.
- `Rectangle` class: A derived class representing a rectangle.

You can explore the code and see how the derived classes (`Circle` and `Rectangle`) can be substituted for the base class (`Shape`) without affecting the correctness of the program.

## Best Practices

Here are some best practices to follow when applying LSP in Java:

1. **Preserve the Contract:** Ensure that derived classes maintain the same contract (method signatures) as the base class.
2. **Override with Caution:** If you override methods in derived classes, make sure you do not violate the expected behavior of the base class methods.
3. **Avoid Code Duplication:** Reuse code and behavior from the base class in derived classes to maintain consistency.

## Contributing

If you would like to contribute to this repository by adding more examples, improving documentation, or suggesting best practices related to LSP in Java, please follow our [contribution guidelines](CONTRIBUTING.md).

