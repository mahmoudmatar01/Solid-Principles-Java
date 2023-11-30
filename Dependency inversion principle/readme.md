# Dependency Inversion Principle (DIP) in Java

This repository provides an explanation of the Dependency Inversion Principle (DIP) and demonstrates its application in Java programming.

## Table of Contents

1. [Dependency Inversion Principle Overview](#dependency-inversion-principle-overview)
2. [DIP in Java](#dip-in-java)
3. [Example](#example)
4. [Best Practices](#best-practices)

## Dependency Inversion Principle Overview

The Dependency Inversion Principle (DIP) is one of the SOLID principles of object-oriented design. It states that high-level modules should not depend on low-level modules. Both should depend on abstractions. In other words, it promotes decoupling between components by introducing abstract interfaces.

## DIP in Java

In Java, adhering to the Dependency Inversion Principle involves designing code in a way that high-level modules (e.g., business logic) depend on abstractions (interfaces or abstract classes), while low-level modules (e.g., data access or external services) also depend on the same abstractions. This allows for flexibility and easier testing.

### Benefits of DIP in Java:

- **Decoupling:** High-level and low-level modules are decoupled, making it easier to modify or replace low-level components.
- **Testing:** Abstractions can be replaced with mock objects during testing, allowing for easier unit testing.
- **Code Extensibility:** Adding new implementations or changing existing ones is straightforward when adhering to abstractions.

## Example

In this repository, you will find a Java example that illustrates the Dependency Inversion Principle. We have created an example with a `Customer` class, a `NotificationService` interface, and two implementations (`EmailNotificationService` and `SMSService`) that adhere to DIP:

- `Customer` class: Represents a customer entity that depends on the `NotificationService` abstraction.
- `NotificationService` interface: Defines the contract for notification services.
- `EmailNotificationService` class: An implementation of the `NotificationService` interface for sending email notifications.
- `SMSService` class: Another implementation of the `NotificationService` interface for sending SMS notifications.

You can explore the code and see how the `Customer` class depends on the `NotificationService` abstraction rather than specific implementations.

## Best Practices

Here are some best practices to follow when applying DIP in Java:

1. **Identify Abstractions:** Identify the abstractions (interfaces or abstract classes) that high-level and low-level modules can depend on.
2. **Use Dependency Injection:** Inject the implementations of abstractions into the high-level modules, typically using constructor or setter injection.
3. **Programming to Interfaces:** High-level modules should program to abstractions, not concrete implementations.



