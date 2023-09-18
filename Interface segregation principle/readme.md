# Interface Segregation Principle (ISP) in Java

This repository provides an explanation of the Interface Segregation Principle (ISP) and demonstrates its application in Java programming.

## Table of Contents

1. [Interface Segregation Principle Overview](#interface-segregation-principle-overview)
2. [ISP in Java](#isp-in-java)
3. [Example](#example)
4. [Best Practices](#best-practices)
5. [Contributing](#contributing)

## Interface Segregation Principle Overview

The Interface Segregation Principle (ISP) is one of the SOLID principles of object-oriented design. It states that clients should not be forced to depend on interfaces they do not use. In other words, it encourages the creation of smaller, more focused interfaces rather than large, monolithic ones.

## ISP in Java

In Java, adhering to the Interface Segregation Principle involves designing interfaces that are specific to the needs of the classes that implement them. This prevents classes from being forced to implement methods they don't need.

### Benefits of ISP in Java:

- **Flexibility:** Classes can implement only the interfaces they need, making them more flexible and less tightly coupled.
- **Reduced Complexity:** Smaller, focused interfaces are easier to understand and maintain.
- **Promotes Reusability:** Specific interfaces can be reused in different classes, promoting code reusability.

## Example

In this repository, you will find a Java example that illustrates the Interface Segregation Principle. We have created an example with an `Worker` interface and two classes, `Manager` and `WorkerImpl`, that adhere to ISP:

- `Worker` interface: Defines methods related to working.
- `Manager` class: A class that requires only a subset of the `Worker` interface methods.
- `WorkerImpl` class: A class that provides a full implementation of the `Worker` interface.

You can explore the code and see how the `Manager` class implements only the methods it needs, adhering to the ISP.

## Best Practices

Here are some best practices to follow when applying ISP in Java:

1. **Design Specific Interfaces:** Create interfaces that are specific to the needs of the classes that will implement them.
2. **Avoid God Interfaces:** Avoid creating large, monolithic interfaces that force classes to implement methods they don't need.
3. **Use Composition:** If a class requires multiple behaviors, use composition (combining multiple smaller interfaces) rather than implementing a single large interface.

## Contributing

If you would like to contribute to this repository by adding more examples, improving documentation, or suggesting best practices related to ISP in Java, please follow our [contribution guidelines](CONTRIBUTING.md).

