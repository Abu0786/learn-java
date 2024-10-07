# Learn Java

This repository contains Java 8 code examples and exercises that demonstrate the use of various features introduced in Java 8, including Streams, Optionals, and enhancements to Collections, as well as Java basics and design patterns.

## Table of Contents

- [Introduction](#introduction)
- [Java 8 Features](#java-8-features)
  - [Streams](#streams)
  - [Optional](#optional)
  - [Collections](#collections)
- [Java Basics](#java-basics)
- [Design Patterns](#design-patterns)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Java 8 introduced several powerful new features that make Java development more efficient and readable. This repository serves as a learning resource for developers looking to understand and apply Java 8 concepts, foundational Java principles, and essential design patterns.

## Java 8 Features

### Streams

The `Stream` API is used to process collections of data in a functional style. It supports operations such as filtering, mapping, and reducing, making data manipulation more readable and concise.

**Examples in this repository:**
- Creating streams from collections
- Filtering, mapping, and reducing data
- Parallel streams for improved performance

### Optional

The `Optional` class is used to represent optional values that may or may not be present, helping to avoid `NullPointerException` errors.

**Examples in this repository:**
- Creating and using `Optional` objects
- Handling values safely with `ifPresent`, `orElse`, and `orElseGet`
- Avoiding null checks with `Optional` methods

### Collections

Java 8 enhanced the `Collection` framework by adding methods like `forEach`, `removeIf`, and `stream` to simplify common tasks.

**Examples in this repository:**
- Using `forEach` for iterating over collections
- Filtering collections with `removeIf`
- Converting collections to streams for more advanced operations

## Java Basics

In addition to Java 8 features, this repository also covers some fundamental Java concepts, including:
- Basic syntax and structure
- Object-oriented programming principles
- Common data structures and algorithms

## Design Patterns

Design patterns are proven solutions to common software design problems. This repository includes implementations of several key design patterns, illustrating how they can be applied in Java.

**Implemented Design Patterns:**

### 1. Singleton

Ensures a class has only one instance and provides a global point of access to it.

**Example:**
- `Singleton.java` demonstrates the Singleton pattern with lazy initialization.

### 2. Factory

Provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

**Example:**
- `FactoryPattern.java` showcases the Factory pattern to create different types of objects based on input.

### 3. Observer

Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Example:**
- `ObserverPattern.java` implements the Observer pattern to manage event handling.

### 4. Strategy

Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

**Example:**
- `StrategyPattern.java` demonstrates the Strategy pattern for interchangeable sorting algorithms.

### 5. Decorator

Allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

**Example:**
- `DecoratorPattern.java` illustrates the Decorator pattern to add responsibilities to objects at runtime.

**Additional Patterns:**
- Feel free to explore other patterns implemented in the repository or suggest new ones you'd like to see!

## How to Use

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Abu0786/learn-java.git
