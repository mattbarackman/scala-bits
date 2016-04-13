# Introduction

## What is Scala?

- Scala is an acronym for “Scalable Language”. The intention is that scala is a language that works well at scale.
- Used for mission-critical systems by companies including Twitter, LinkedIn, and Intel.

### Key Aspects
- Compiled
- Interoperates with Java
- Object-Oriented
- Functional

### Resources:
- [Scala - What is Scala?](http://www.scala-lang.org/what-is-scala.html)

## What is a compiled language?

- Source code is run through a compiler that converts it from one programming language to another.

### Examples:
  - Java -> Java bytecode
  - Scala -> Java bytecode
  - Elixir -> Erlang

### Advantages

- Allows you to write code in a higher level language.
  - Cleaner, less verbose syntax
  - New features and paradigms

- Allows you to execute in a lower level language or machine code.
  - better portability
    - Java bytecode runs on the widely supported JVM.
    - Erlang runs on the widely supported ErlangVM.
  - better performance
    - closer to the bare metal

- The compiler often finds bugs / typos through static analysis

### Disadvantages

TBD

## What is an interpreted language?

- Source code is interpreted directly at runtime by an interpreter.

### Languages
  - Ruby
  - Javascript
  - Perl
  - PHP

### Advantages

- Platform independence
- Reflection (Meta-Programming)
- Dynamic Typing (Duck Typing)

### Disadvantages

- Without static type-checking, bugs are often only found at runtime
- Generally not as performant as native machine code.

## What is the JVM?

- Virtual Machine for executing Java bytecode.
- Implemented for thousands of machine architectures.

## What is object-oriented programming (OOP)?

- A paradigm for organizing code into objects that map to intuitive understandings of the world.
- These objects contain data and methods (procedures) for operating on that data.
- Methods are generally defined on objects called classes, and instances are generated from those classes containing specific data.
  - e.g. You may have a class Car, with specific instances having different mileages, ages, and fuel levels.

### Languages where OOP is the dominant paradigm
  - Ruby
  - Java
  - Javascript
  - Scala

## What is functional programming (FP)?

- A paradigm of programming where data is immutable and side-effects are pushed out to the surface of the code.

- In its purest form, functions written in this way are called referentially transaparent, which means that a function doensn't mutate state and always returns the same result for the given arguments no matter the context.

```scala
  var counter: Int = 0

  // non-referentially transparent
  // increment relies on external state
  def increment() = counter + 1
```

```scala
  var counter: Int = 0

  // non-referentially transparent
  // increment relies on and mutates external state
  def increment() = counter += 1
```

```scala
  // referentially transparent
  // increment always returns the same value for a given input
  def increment(x: Int) = x + 1
```

- Most languages designed for FP have functions as First-Class citizens, meaning functions can be passed as arguments to other functions.

### Advantages
- Makes code easier to reason about as you don't have to understand the context around it.
- Makes code easier to test as it is isolated from outside state. You must inject all state into the function.

### Disadvantages
- It is a paradigm shift for many developers to not be able to use mutable state.
- Side effects must be accumulated and their exectution deferred, which may be hard to reason about.

### Languages where FP is the dominant paradigm
  - Elixir
  - Erlang
  - Haskell
  - Scala
