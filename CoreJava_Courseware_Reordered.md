# Core Java — Comprehensive Courseware

> 📘 **Java Full Stack Training** | Duration: 3 Days | Level: Fresher / Beginner

---

## Table of Contents


**🧱 PHASE 1: Foundations**
- [1. JVM Architecture](#1-jvm-architecture)
- [2. Introduction to Java and OOP](#2-introduction-to-java-and-oop)
- [3. Software Installation and First Java Program](#3-software-installation-and-first-java-program)

**🔤 PHASE 2: Language Basics**
- [4. Datatypes, Literals, Variables, Type Conversion, Casting & Promotion](#4-datatypes-literals-variables-type-conversion-casting-promotion)
- [5. Operators and Assignments](#5-operators-and-assignments)
- [6. Flow Control Statements](#6-flow-control-statements)
- [7. Arrays](#7-arrays)

**🏗️ PHASE 3: OOP Building Blocks**
- [8. Packages](#8-packages)
- [9. Access Modifiers](#9-access-modifiers)
- [10. Non-Static Members and Their Execution Control Flow](#10-non-static-members-and-their-execution-control-flow)
- [11. Static Members and Their Execution Control Flow](#11-static-members-and-their-execution-control-flow)
- [12. Encapsulation](#12-encapsulation)
- [13. Inheritance](#13-inheritance)
- [14. Abstraction](#14-abstraction)
- [15. Polymorphism](#15-polymorphism)
- [16. Inner Classes](#16-inner-classes)

**📦 PHASE 4: Core Java APIs**
- [17. Object Class Methods](#17-object-class-methods)
- [18. String Handling](#18-string-handling)
- [19. Wrapper Classes with Autoboxing & Unboxing](#19-wrapper-classes-with-autoboxing-unboxing)
- [20. Enums](#20-enums)
- [21. Collections with Generics](#21-collections-with-generics)

**🛡️ PHASE 5: Applied OOP**
- [22. Exception Handling and Assertions](#22-exception-handling-and-assertions)
- [23. IO Streams (File IO)](#23-io-streams-file-io)
- [24. Java Annotations](#24-java-annotations)
- [25. Event Management Usecase](#25-event-management-usecase)

**⚙️ PHASE 6: Concurrency & Memory**
- [26. Multithreading](#26-multithreading)
- [27. Executor Framework Quick Start](#27-executor-framework-quick-start)
- [28. Garbage Collection & Types of Objects](#28-garbage-collection-types-of-objects)

**🚀 PHASE 7: Modern Java**
- [29. Java 8 Features](#29-java-8-features)
- [30. HTTP Client API (Java 11+)](#30-http-client-api-java-11)
- [31. Java 13 and 14 Features](#31-java-13-and-14-features)

**🎯 PHASE 8: Interview Preparation**
- [32. Core Java - Interview Questions](#32-core-java-interview-questions)

---


---

## 🧱 PHASE 1: Foundations

---


## 1. JVM Architecture

### Overview

The JVM (Java Virtual Machine) is the runtime environment that executes Java bytecode. Understanding JVM internals helps in writing better, optimized code and diagnosing issues.

> *🔎 Real-World Analogy: JVM is like a translator at the UN. The speaker (Java code) gives a speech in their language (bytecode). The translator (JVM) interprets it to the audience (OS/hardware) in real time.*

### JVM Components

## 1. ClassLoader

- Bootstrap ClassLoader - loads core Java libraries (rt.jar)

- Extension ClassLoader - loads from ext directory

- Application ClassLoader - loads application classes

- Delegation: child asks parent first (parent delegation model)

## 2. Runtime Data Areas (Memory)

- Method Area - class-level data: class name, methods, static variables

- Heap - all objects and instance variables live here (GC managed)

- JVM Stack - each thread gets its own stack; stores frames (local vars, operands)

- Program Counter Register - tracks current instruction per thread

- Native Method Stack - for native (C/C++) method calls

## 3. Execution Engine

- Interpreter - interprets bytecode line by line (slow initially)

- JIT Compiler - compiles hot (frequently used) bytecode to native machine code

- Garbage Collector - manages heap memory

### JVM Execution Flow

- 1\. Java source code (.java) compiled by javac to bytecode (.class)

- 2\. ClassLoader loads .class files into Method Area

- 3\. Bytecode verifier checks for security violations

- 4\. Execution Engine runs the bytecode

- 5\. JIT optimizes hot paths to native code


## 2. Introduction to Java and OOP

### What is Java?

Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It follows the principle: Write Once, Run Anywhere (WORA).

> *🔎 Real-World Analogy: Java is like a universal power adapter. You write your code once and it runs on any device that has a JVM installed, just as the adapter works in any country's power socket.*

### Why Java?

- Platform-independent via the JVM

- Object-Oriented from the ground up

- Strongly typed - catches errors at compile time

- Rich standard library (Java SE API)

- Widely used in enterprise, Android, and backend systems

### What is Object-Oriented Programming (OOP)?

OOP is a programming paradigm that organizes software design around data (objects) rather than functions and logic. An object is a self-contained unit that combines state (fields) and behavior (methods).

### The Four Pillars of OOP

- Encapsulation - Hiding internal data, exposing only what's needed

- Inheritance - Reusing code by extending existing classes

- Polymorphism - One interface, many forms

- Abstraction - Hiding complexity, showing only essentials

> *🔎 Real-World Analogy: Think of a Car. You don't need to know how the engine works (abstraction). Each car has its own speed and color (encapsulation). A Tesla and a BMW are both cars (inheritance). The 'accelerate' action works differently in each but is called the same way (polymorphism).*


## 3. Software Installation and First Java Program

### What You Need

- JDK (Java Development Kit) - Download from https://adoptium.net or Oracle

- IDE: IntelliJ IDEA (recommended), Eclipse, or VS Code with Java extension

- Maven (for project management - covered later)

### JDK vs JRE vs JVM

JDK = JRE + development tools (compiler, debugger). JRE = JVM + standard libraries. JVM = Java Virtual Machine that runs bytecode.

> *🔎 Real-World Analogy: JVM is the engine, JRE is the car (engine + body), JDK is the full factory (car + tools to manufacture more cars).*

### Your First Java Program

**Code Example:**

```java
public class HelloWorld {

public static void main(String[] args) {

System.out.println("Hello, World!");

}

}
```

### Breaking It Down

- public class HelloWorld - Declares a class named HelloWorld

- public static void main(String[] args) - Entry point of every Java program

- System.out.println() - Prints text to the console

> *💡 Tip: Java is case-sensitive. HelloWorld and helloworld are different identifiers.*

### Compile and Run

**From Command Line:**

```java
javac HelloWorld.java // compiles to HelloWorld.class (bytecode)

java HelloWorld // JVM runs the bytecode
```


---

## 🔤 PHASE 2: Language Basics

---


## 4. Datatypes, Literals, Variables, Type Conversion, Casting & Promotion

### Primitive Data Types

Java has 8 primitive types:

- byte (8-bit): range -128 to 127

- short (16-bit): range -32,768 to 32,767

- int (32-bit): most common integer type

- long (64-bit): for large numbers, suffix L e.g. 100L

- float (32-bit): decimal, suffix f e.g. 3.14f

- double (64-bit): default decimal type

- char (16-bit): single Unicode character e.g. 'A'

- boolean: true or false

### Variables

A variable is a named storage location with a type.

**Code Example:**

```java
int age = 25;

double salary = 55000.50;

char grade = 'A';

boolean isActive = true;

String name = "Alice"; // String is a class, not primitive
```

### Literals

Literals are fixed values assigned directly in code.

- Integer literal: 42, 0xFF (hex), 0b1010 (binary)

- Floating-point: 3.14, 2.5e3 (scientific)

- Character: 'A', '\n' (newline escape)

- String: "Hello World"

- Boolean: true, false

### Type Conversion

### Widening (Implicit/Automatic)

Small type automatically converted to larger type. No data loss.

```java
int i = 100;

long l = i; // int -\> long (widening, automatic)

double d = l; // long -\> double (widening, automatic)
```

### Narrowing (Explicit/Casting)

Larger type to smaller type. May lose data. Must be done explicitly.

> double d = 9.99;
> 
> int i = (int) d; // i = 9 (decimal part lost)
> 
> *💡 Tip: Always be careful with narrowing - you might lose data silently!*

### Type Promotion in Expressions

In arithmetic, smaller types are promoted to int (at minimum) before the operation.

```java
byte a = 10, b = 20;

// byte result = a + b; // ERROR! a+b is promoted to int

int result = a + b; // Correct
```


## 5. Operators and Assignments

### Arithmetic Operators

```java
\+ - \* / % (modulus = remainder)
```

**Code Example:**

```java
int a = 10, b = 3;

System.out.println(a + b); // 13

System.out.println(a % b); // 1 (remainder of 10/3)
```

### Relational Operators

> == != \> \< \>= \<=
> 
> *💡 Tip: Use == to compare primitives. Use .equals() to compare object content (like Strings).*

### Logical Operators

- && (AND) - true if both sides true

- \|\| (OR) - true if at least one side true

- ! (NOT) - reverses boolean value

**Short-circuit evaluation:**

```java
if (x != null && x.length() \> 0) { ... }
```

If x is null, the second condition is never evaluated (&& short-circuits). This prevents NullPointerException.

### Bitwise Operators

> & \| ^ ~ \<\< \>\> \>\>\>
> 
> *💡 Tip: Bitwise operators are mainly used in low-level programming, flags, and performance-critical code.*

### Assignment Operators

```java
= += -= \*= /= %=

int x = 10;

x += 5; // same as x = x + 5; -\> x is now 15
```

### Increment & Decrement

```java
int i = 5;

System.out.println(i++); // prints 5, then i becomes 6 (post-increment)

System.out.println(++i); // i becomes 7, then prints 7 (pre-increment)
```

### Ternary Operator

> int max = (a \> b) ? a : b; // if a\>b then max=a, else max=b
> 
> *🔎 Real-World Analogy: Ternary is like a vending machine: press button A -\> get drink A, press button B -\> get drink B. One decision, two outcomes.*


## 6. Flow Control Statements

**if / else if / else**

**Code Example:**

```java
int score = 75;

if (score \>= 90) {

System.out.println("A");

} else if (score \>= 75) {

System.out.println("B");

} else {

System.out.println("C");

}
```

**switch Statement**

**Code Example:**

> String day = "MON";
> 
> switch (day) {
> 
> case "MON": System.out.println("Monday"); break;
> 
> case "TUE": System.out.println("Tuesday"); break;
> 
> default: System.out.println("Other day");
> 
> }
> 
> *💡 Tip: From Java 14+, you can use switch expressions with -\> arrow syntax for cleaner code.*

**for Loop**

**Code Example:**

```java
for (int i = 0; i \< 5; i++) {

System.out.println("Count: " + i);

}
```

**while and do-while**

**while - checks condition first:**

```java
int i = 0;

while (i \< 5) { System.out.println(i); i++; }
```

**do-while - executes at least once:**

```java
int i = 0;

do { System.out.println(i); i++; } while (i \< 5);
```

### Enhanced for Loop (for-each)

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int n : numbers) {

System.out.println(n);

}
```

**break, continue, return**

- break - exits the loop or switch entirely

- continue - skips the current iteration, moves to next

- return - exits the method, optionally returning a value

> *🔎 Real-World Analogy: break is like pulling an emergency exit. continue is like skipping one chapter in a book. return is like finishing your shift at work.*


## 7. Arrays

### What Is an Array?

An array is a fixed-size, ordered collection of elements of the same type. Stored in contiguous memory.

> *🔎 Real-World Analogy: An array is like a row of numbered parking slots. Each slot holds one car (element) and has a number (index) starting from 0.*

### Declaring and Using Arrays

**Code Example:**

```java
int[] numbers = new int[5]; // declare, size=5, default values=0

numbers[0] = 10;

numbers[1] = 20;

// Inline initialization

int[] primes = {2, 3, 5, 7, 11};

System.out.println(primes.length); // 5

System.out.println(primes[2]); // 5 (index 2)
```

### Iterating Arrays

**Traditional for loop:**

```java
for (int i = 0; i \< primes.length; i++) {

System.out.println(primes[i]);

}
```

**Enhanced for loop:**

```java
for (int p : primes) { System.out.println(p); }
```

### 2D Arrays

**Code Example:**

```java
int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

System.out.println(matrix[1][2]); // 6 (row 1, col 2)
```

### Arrays Utility Class

**java.util.Arrays:**

```java
import java.util.Arrays;

int[] arr = {5, 3, 1, 4, 2};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

int idx = Arrays.binarySearch(arr, 3); // finds index of 3
```


---

## 🏗️ PHASE 3: OOP Building Blocks

---


## 8. Packages

### What Is a Package?

A package is a namespace that organizes a set of related classes and interfaces. It prevents naming conflicts and controls access.

> *🔎 Real-World Analogy: Packages are like folders on your computer. You can have a file named 'Report.java' in the 'sales' folder and another 'Report.java' in the 'hr' folder - they don't conflict.*

### Declaring and Using Packages

**Declaring (first line in file):**

```java
package com.company.training;
```

**Importing from another package:**

```java
import java.util.ArrayList;

import java.util.\*; // import all classes in java.util
```

### Java Standard Packages

- java.lang - Auto-imported. Contains String, Math, System, Object

- java.util - Collections, Date, Scanner

- java.io - File I/O streams

- java.net - Networking

- java.sql - Database connectivity

### Naming Convention

Use reverse domain name: com.companyname.projectname.modulename

```java
package com.acme.hrms.payroll;
```


## 9. Access Modifiers

### The Four Access Modifiers

Access modifiers control the visibility of classes, methods, and fields.

- public - accessible from anywhere

- protected - accessible within the same package and subclasses

- default (no keyword) - accessible only within the same package

- private - accessible only within the same class

### Access Modifier Table

Visibility from most restricted to most open: private \< default \< protected \< public

**Code Example:**

> public class BankAccount {
> 
> private double balance; // only within this class
> 
> protected String owner; // package + subclasses
> 
> String branch; // package only (default)
> 
> public String accountNo; // everywhere
> 
> }
> 
> *🔎 Real-World Analogy: Think of a house: public is the front door (anyone can knock), protected is for family and invited guests, default is only for people on the same street, private is your personal diary.*
> 
> *💡 Tip: Best practice: Make fields private and expose them through public getter/setter methods. This is Encapsulation.*


## 10. Non-Static Members and Their Execution Control Flow

### What Are Non-Static (Instance) Members?

Instance members belong to individual objects. Each object has its own copy of instance fields, and instance methods operate on those fields.

> *🔎 Real-World Analogy: Every student has their own name, age, and roll number - these are instance fields. Two students can have different names even though they belong to the same Student class.*

### Instance Fields and Methods

**Code Example:**

```java
public class Student {

String name; // instance field

int age;

void display() { // instance method

System.out.println(name + " is " + age + " years old");

}

}

Student s1 = new Student();

s1.name = "Alice"; s1.age = 20;

s1.display(); // Alice is 20 years old
```

### The 'this' Keyword

'this' refers to the current object. Used to differentiate instance variables from parameters with the same name.

**Code Example:**

```java
public class Student {

String name;

Student(String name) {

this.name = name; // 'this.name' is the field; 'name' is the parameter

}

}
```

### Constructor

A constructor initializes a new object. It has the same name as the class and no return type.

- Default constructor - provided by Java if you define none

- Parameterized constructor - takes arguments to initialize fields

- Constructor overloading - multiple constructors with different signatures

**Code Example:**

```java
public class Book {

String title; int pages;

Book() { this.title = "Unknown"; this.pages = 0; }

Book(String title, int pages) {

this.title = title; this.pages = pages;

}

}
```


## 11. Static Members and Their Execution Control Flow

### What Are Static Members?

Static members (fields and methods) belong to the class itself, not to any specific object. They are shared across all instances of the class.

> *🔎 Real-World Analogy: A school's name is static - it belongs to the school, not to any individual student. Every student shares the same school name.*

### Static Fields

**Code Example:**

```java
public class Counter {

static int count = 0; // shared across all objects

Counter() { count++; }

}
```

### Static Methods

- Can be called without creating an object: ClassName.methodName()

- Cannot access non-static (instance) members directly

- Math.sqrt(), Integer.parseInt() are classic static methods

**Code Example:**

```java
public class MathUtils {

public static int add(int a, int b) {

return a + b;

}

}

// Called as: MathUtils.add(3, 5);
```

### Static Block

A static block runs once when the class is first loaded, before any object is created. Used for one-time initialization.

**Code Example:**

```java
public class Config {

static String dbUrl;

static {

dbUrl = "jdbc:mysql://localhost/mydb";

System.out.println("Config loaded");

}

}
```

### Execution Order

- 1\. Static blocks/fields - executed once when class loads

- 2\. Instance blocks - executed every time an object is created

- 3\. Constructor - executed after instance blocks

- 4\. main() method - program entry point

> *💡 Tip: Static context is ready before any object exists. That's why main() must be static - the JVM calls it before creating any object.*


## 12. Encapsulation

### What Is Encapsulation?

Encapsulation is the practice of wrapping data (fields) and methods together, and restricting direct access to the data. It protects the integrity of the data.

> *🔎 Real-World Analogy: A capsule (medicine) holds the drug inside a protective shell. You consume it without handling the raw chemicals. Similarly, private fields are protected inside a class, accessed only through controlled methods.*

### Implementing Encapsulation

**Code Example:**

```java
public class Employee {

private String name;

private double salary;

public String getName() { return name; }

public void setName(String name) {

if (name != null && !name.isEmpty())

this.name = name;

}

public double getSalary() { return salary; }

public void setSalary(double salary) {

if (salary \> 0) this.salary = salary;

}

}
```

### Why Encapsulation Matters

- Validation: setter can reject invalid data (e.g., negative salary)

- Read-only fields: provide only getter, no setter

- Flexibility: internal implementation can change without affecting callers

- Security: prevents unauthorized modification

### Java Beans Convention

- All fields are private

- Public getter: getName(), getSalary()

- Public setter: setName(), setSalary()

- Boolean getters use 'is' prefix: isActive(), isValid()


## 13. Inheritance

### What Is Inheritance?

Inheritance allows a class (child/subclass) to acquire the properties and behaviors of another class (parent/superclass). It promotes code reuse.

> *🔎 Real-World Analogy: A child inherits traits (eye color, height) from parents. Similarly, a Dog class can inherit from an Animal class and reuse its eat() and sleep() methods while adding its own bark() method.*

**extends Keyword**

**Code Example:**

```java
public class Animal {

String name;

void eat() { System.out.println(name + " is eating"); }

}

public class Dog extends Animal {

void bark() { System.out.println(name + " says Woof!"); }

}

Dog d = new Dog();

d.name = "Bruno";

d.eat(); // inherited from Animal

d.bark(); // Dog's own method
```

### The super Keyword

- super.method() - calls the parent class method

- super() - calls the parent class constructor (must be first line)

**Code Example:**

```java
public class Vehicle {

int speed;

Vehicle(int speed) { this.speed = speed; }

}

public class Car extends Vehicle {

String brand;

Car(String brand, int speed) {

super(speed); // calls Vehicle constructor

this.brand = brand;

}

}
```

### Types of Inheritance in Java

- Single - one class extends one class

- Multilevel - A extends B, B extends C

- Hierarchical - Multiple classes extend the same parent

> *💡 Tip: Java does NOT support multiple inheritance with classes (to avoid the diamond problem). Use interfaces instead.*

### Method Overriding

A subclass can redefine a method from its parent class using the same signature.

**Code Example:**

> public class Animal {
> 
> void sound() { System.out.println("Some sound"); }
> 
> }
> 
> public class Cat extends Animal {
> 
> @Override
> 
> void sound() { System.out.println("Meow"); }
> 
> }
> 
> *💡 Tip: Always use @Override annotation. It helps the compiler catch mistakes if the method signature doesn't match the parent.*


## 14. Abstraction

### What Is Abstraction?

Abstraction means hiding implementation complexity and showing only the essential features to the user.

> *🔎 Real-World Analogy: When you use a TV remote, you press a button and the channel changes. You don't need to know the infrared signals and electronic circuits inside the remote. That complexity is abstracted away.*

### Abstract Classes

An abstract class cannot be instantiated. It may have both abstract methods (no body) and concrete methods (with body).

**Code Example:**

```java
public abstract class Shape {

String color;

abstract double area(); // must be implemented by subclasses

void display() { // concrete method - inherited as-is

System.out.println("Color: " + color);

}

}

public class Circle extends Shape {

double radius;

Circle(double r) { this.radius = r; }

@Override

double area() { return Math.PI \* radius \* radius; }

}
```

### Interfaces

An interface is a contract - it defines what methods a class MUST implement, but not how. From Java 8, interfaces can also have default and static methods.

**Code Example:**

```java
public interface Drawable {

void draw(); // abstract by default

default void show() { // Java 8 default method

System.out.println("Displaying shape...");

}

}

public class Rectangle implements Drawable {

@Override

public void draw() { System.out.println("Drawing Rectangle"); }

}
```

### Abstract Class vs Interface

- Abstract class: use when classes share common code/state

- Interface: use when unrelated classes need the same capability

- A class can implement multiple interfaces but extend only one class

> *💡 Tip: Rule of thumb: 'is-a' relationship -\> abstract class. 'can-do' relationship -\> interface. A Dog IS an Animal. A Dog CAN BE trained (Trainable interface).*


## 15. Polymorphism

### What Is Polymorphism?

Polymorphism means 'many forms'. The same method name can behave differently based on the object or context.

> *🔎 Real-World Analogy: A person can be an employee, a parent, and a customer simultaneously. As an employee they work, as a parent they care, as a customer they shop. Same person, different behaviors depending on role.*

### Compile-Time Polymorphism: Method Overloading

Same method name, different parameter lists, in the SAME class.

**Code Example:**

```java
public class Calculator {

int add(int a, int b) { return a + b; }

double add(double a, double b) { return a + b; }

int add(int a, int b, int c) { return a + b + c; }

}
```

### Runtime Polymorphism: Method Overriding

A parent class reference can hold a child class object. The actual method called is determined at runtime.

**Code Example:**

```java
Animal animal = new Dog(); // parent reference, child object

animal.sound(); // calls Dog's sound() at runtime -\> 'Woof'

animal = new Cat();

animal.sound(); // calls Cat's sound() at runtime -\> 'Meow'
```

### Polymorphism with Interfaces

**Code Example:**

> Drawable d = new Rectangle();
> 
> d.draw(); // Rectangle's draw() called
> 
> d = new Circle();
> 
> d.draw(); // Circle's draw() called
> 
> *💡 Tip: This is the foundation of SOLID design principles - programming to an interface, not an implementation.*


## 16. Inner Classes

### Types of Inner Classes

## 1. Non-static (Regular) Inner Class

Has access to all members (including private) of the outer class.

**Code Example:**

```java
public class Outer {

private int x = 10;

class Inner {

void show() { System.out.println("x = " + x); }

}

}

Outer.Inner obj = new Outer().new Inner();

obj.show();
```

## 2. Static Nested Class

Declared static. Can only access static members of the outer class.

**Code Example:**

```java
public class Outer {

static int y = 20;

static class Nested {

void show() { System.out.println("y = " + y); }

}

}

Outer.Nested obj = new Outer.Nested();
```

## 3. Local Inner Class

Defined inside a method. Accessible only within that method.

## 4. Anonymous Inner Class

A class with no name, defined and instantiated in one expression. Commonly used for event handlers and callbacks.

**Code Example:**

> Runnable r = new Runnable() {
> 
> @Override
> 
> public void run() {
> 
> System.out.println("Anonymous inner class running");
> 
> }
> 
> };
> 
> r.run();
> 
> *💡 Tip: From Java 8, anonymous inner classes for single-method interfaces can be replaced with lambdas.*


---

## 📦 PHASE 4: Core Java APIs

---


## 17. Object Class Methods

### The Root of All Classes

Every class in Java implicitly extends java.lang.Object. It provides several methods that all objects inherit.

**equals() Method**

Default: compares references (same as ==). Override to compare content.

**Code Example:**

```java
public class Point {

int x, y;

@Override

public boolean equals(Object obj) {

if (this == obj) return true;

if (!(obj instanceof Point)) return false;

Point p = (Point) obj;

return this.x == p.x && this.y == p.y;

}

}
```

**hashCode() Method**

Returns an integer hash. Must be overridden alongside equals(). Two equal objects must have the same hash code.

**Code Example:**

> @Override
> 
> public int hashCode() {
> 
> return Objects.hash(x, y);
> 
> }
> 
> *💡 Tip: If you override equals(), always override hashCode() too. Not doing so breaks HashMap and HashSet behavior.*

**toString() Method**

Default returns class name + @ + hex hashcode. Override for meaningful output.

**Code Example:**

```java
@Override

public String toString() {

return "Point(" + x + ", " + y + ")";

}
```

**clone() Method**

Creates a copy of the object. Class must implement Cloneable interface.

**getClass(), instanceof**

```java
Object obj = new String("hello");

System.out.println(obj.getClass().getName()); // java.lang.String

System.out.println(obj instanceof String); // true
```


## 18. String Handling

### String Immutability

Strings in Java are immutable - once created, their value cannot be changed. Every operation creates a new String.

> *🔎 Real-World Analogy: A String is like a stone tablet. You can't erase it - you carve a new tablet. This is why String is safe to share across threads.*

### String Pool

Java maintains a String constant pool in the heap. String literals are pooled and reused.

**Code Example:**

```java
String s1 = "Hello";

String s2 = "Hello";

String s3 = new String("Hello");

System.out.println(s1 == s2); // true (same pool reference)

System.out.println(s1 == s3); // false (s3 is new object)

System.out.println(s1.equals(s3)); // true (content equal)
```

### Important String Methods

**Code Examples:**

```java
String s = " Hello World ";

s.length() // 15

s.trim() // "Hello World"

s.toLowerCase() // " hello world "

s.toUpperCase() // " HELLO WORLD "

s.contains("World") // true

s.replace("World", "Java") // " Hello Java "

s.substring(7, 12) // "World"

s.split(" ") // array of words

s.charAt(7) // 'W'

s.indexOf("World") // 8
```

### StringBuilder vs StringBuffer

- String - immutable, thread-safe, but slow for many concatenations

- StringBuilder - mutable, NOT thread-safe, fastest for single-threaded use

- StringBuffer - mutable, thread-safe (synchronized), slower than StringBuilder

**Code Example:**

> StringBuilder sb = new StringBuilder();
> 
> sb.append("Hello");
> 
> sb.append(" World");
> 
> String result = sb.toString(); // "Hello World"
> 
> *💡 Tip: Use StringBuilder inside loops for string concatenation. Using + inside a loop creates many temporary String objects.*


## 19. Wrapper Classes with Autoboxing & Unboxing

### What Are Wrapper Classes?

Wrapper classes provide an object representation of each primitive type. They are needed when working with Collections, Generics, or APIs that require objects.

- int -\> Integer

- double -\> Double

- char -\> Character

- boolean -\> Boolean

- byte -\> Byte, short -\> Short, long -\> Long, float -\> Float

### Useful Methods

**Code Example:**

```java
int num = Integer.parseInt("42"); // String to int

String s = Integer.toString(42); // int to String

int max = Integer.MAX_VALUE; // 2147483647

double d = Double.parseDouble("3.14");
```

### Autoboxing

Java automatically converts a primitive to its wrapper class when needed.

**Code Example:**

```java
List\<Integer\> list = new ArrayList\<\>();

list.add(5); // autoboxing: int 5 -\> Integer(5) automatically
```

### Unboxing

Java automatically converts a wrapper object to its primitive when needed.

**Code Example:**

> Integer wrapped = 100;
> 
> int primitive = wrapped; // unboxing: Integer -\> int automatically
> 
> int result = wrapped + 50; // unboxing happens in arithmetic
> 
> *💡 Tip: Watch out for NullPointerException with unboxing! If an Integer is null and you unbox it, Java throws NPE.*
> 
> *🔎 Real-World Analogy: Autoboxing is like putting a letter (primitive value) in an envelope (wrapper object) so it can be mailed through the postal system (Collections framework). Unboxing is opening the envelope to read the letter.*


## 20. Enums

### What Is an Enum?

An enum (enumeration) is a special type that represents a group of constants. Enums are type-safe, readable, and more powerful than using int or String constants.

> *🔎 Real-World Analogy: Traffic lights: RED, YELLOW, GREEN. These are a fixed set of known values - exactly what an enum models.*

### Basic Enum

**Code Example:**

```java
public enum Day {

MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}

Day today = Day.WEDNESDAY;

if (today == Day.SATURDAY || today == Day.SUNDAY) {

System.out.println("Weekend!");

}
```

### Enum with Fields and Methods

**Code Example:**

```java
public enum Planet {

MERCURY(3.303e+23, 2.4397e6),

EARTH(5.976e+24, 6.37814e6);

private final double mass;

private final double radius;

Planet(double mass, double radius) {

this.mass = mass; this.radius = radius;

}

double surfaceGravity() { return 6.67300E-11 \* mass / (radius \* radius); }

}
```

### Enum in Switch

```java
switch (today) {

case MONDAY: System.out.println("Start of work week"); break;

case FRIDAY: System.out.println("TGIF!"); break;

default: System.out.println("Midweek");

}
```

### Enum Methods

- Day.values() - returns all enum constants

- Day.valueOf("MONDAY") - returns enum constant by name

- today.name() - returns constant name as String

- today.ordinal() - returns position (0-based)


## 21. Collections with Generics

### What Is the Collections Framework?

A unified architecture for storing and manipulating groups of objects. It includes interfaces, implementations, and algorithms.

### Key Interfaces

- Collection - root interface

- List - ordered, duplicates allowed (ArrayList, LinkedList)

- Set - no duplicates (HashSet, TreeSet, LinkedHashSet)

- Map - key-value pairs, no duplicate keys (HashMap, TreeMap, LinkedHashMap)

- Queue / Deque - FIFO / double-ended (ArrayDeque, PriorityQueue)

### Generics

Generics enable type-safe collections. They eliminate the need for casting and catch type errors at compile time.

**Code Example:**

```java
List\<String\> names = new ArrayList\<\>();

names.add("Alice");

names.add("Bob");

// names.add(42); // Compile error! Type safety

String first = names.get(0); // No casting needed
```

### List - ArrayList

**Code Example:**

```java
List\<Integer\> nums = new ArrayList\<\>();

nums.add(10); nums.add(20); nums.add(30);

nums.remove(Integer.valueOf(20)); // removes by value

nums.set(0, 99); // update index 0

System.out.println(nums.size());
```

### Map - HashMap

**Code Example:**

```java
Map\<String, Integer\> scores = new HashMap\<\>();

scores.put("Alice", 95);

scores.put("Bob", 87);

System.out.println(scores.get("Alice")); // 95

for (Map.Entry\<String, Integer\> e : scores.entrySet()) {

System.out.println(e.getKey() + " -\> " + e.getValue());

}
```

### Set - HashSet

**Code Example:**

```java
Set\<String\> cities = new HashSet\<\>();

cities.add("Delhi"); cities.add("Mumbai"); cities.add("Delhi");

System.out.println(cities.size()); // 2 (no duplicates)
```

### Sorting with Comparable and Comparator

**Comparable (natural order - inside the class):**

```java
public class Student implements Comparable\<Student\> {

int marks;

@Override

public int compareTo(Student s) { return this.marks - s.marks; }

}
```

**Comparator (external / custom order):**

```java
students.sort(Comparator.comparing(s -\> s.name));
```


---

## 🛡️ PHASE 5: Applied OOP

---


## 22. Exception Handling and Assertions

### What Is an Exception?

An exception is an abnormal condition that disrupts the normal flow of a program. Java uses a structured mechanism to handle them gracefully.

> *🔎 Real-World Analogy: Exceptions are like emergencies at work. You need a plan (try-catch) for what to do if something goes wrong, and an emergency contact (finally block) who must always be called no matter what.*

### Exception Hierarchy

- Throwable

- -\> Error (OutOfMemoryError, StackOverflowError) - do not catch

- -\> Exception

- -\> Checked Exceptions (IOException, SQLException) - must handle

- -\> RuntimeException (NullPointerException, ArrayIndexOutOfBoundsException) - unchecked

**try-catch-finally**

**Code Example:**

```java
try {

int result = 10 / 0; // ArithmeticException

} catch (ArithmeticException e) {

System.out.println("Cannot divide by zero: " + e.getMessage());

} finally {

System.out.println("This always runs");

}
```

### Multiple Catch Blocks

**Code Example:**

> try {
> 
> String s = null;
> 
> System.out.println(s.length());
> 
> } catch (NullPointerException e) {
> 
> System.out.println("Null value: " + e);
> 
> } catch (Exception e) {
> 
> System.out.println("General error: " + e);
> 
> }
> 
> *💡 Tip: Order matters! Catch specific exceptions before general ones.*

**throws and throw**

**throw - manually throw an exception:**

```java
throw new IllegalArgumentException("Age cannot be negative");
```

**throws - declare that a method may throw an exception:**

```java
public void readFile(String path) throws IOException { ... }
```

### Custom Exceptions

**Code Example:**

```java
public class InsufficientFundsException extends Exception {

public InsufficientFundsException(String msg) { super(msg); }

}
```

**try-with-resources (Java 7+)**

Automatically closes resources that implement AutoCloseable.

```java
try (FileReader fr = new FileReader("file.txt")) {

// use fr - it will be auto-closed

} catch (IOException e) { ... }
```

### Assertions

Assertions are developer-only checks that verify assumptions. Disabled in production.

> assert age \>= 0 : "Age must be non-negative";
> 
> *💡 Tip: Enable assertions at runtime: java -ea MyClass*


## 23. IO Streams (File IO)

### Stream Hierarchy

- Byte Streams: InputStream / OutputStream - for binary data

- Character Streams: Reader / Writer - for text data

- Buffered Streams: faster due to internal buffering

### Reading a File

**Using BufferedReader (character stream):**

```java
import java.io.\*;

try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

String line;

while ((line = br.readLine()) != null) {

System.out.println(line);

}

} catch (IOException e) {

e.printStackTrace();

}
```

### Writing a File

**Using BufferedWriter:**

```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

bw.write("Hello, File!");

bw.newLine();

bw.write("Second line");

} catch (IOException e) { e.printStackTrace(); }
```

### NIO (New IO) - Java 7+ Approach

> import java.nio.file.\*;
> 
> // Read all lines
> 
> List\<String\> lines = Files.readAllLines(Path.of("data.txt"));
> 
> // Write content
> 
> Files.writeString(Path.of("out.txt"), "Hello NIO!");
> 
> *💡 Tip: Prefer NIO (java.nio.file.Files and Paths) for modern Java file handling. It is cleaner and more powerful.*


## 24. Java Annotations

### What Are Annotations?

Annotations are metadata (data about data) attached to code elements (classes, methods, fields). They do NOT change program logic directly, but provide information for compilers, frameworks, or tools.

> *🔎 Real-World Analogy: Annotations are like labels on a package. The label doesn't change what's inside the box, but tells the courier system how to handle it (fragile, express, etc.).*

### Built-in Annotations

- @Override - tells compiler this method overrides a parent method

- @Deprecated - marks a method/class as outdated

- @SuppressWarnings - suppresses compiler warnings

- @FunctionalInterface - marks an interface as functional (one abstract method)

- @SafeVarargs - suppresses unchecked warnings for varargs

### Creating Custom Annotations

**Code Example:**

```java
import java.lang.annotation.\*;

@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.METHOD)

public @interface LogExecutionTime {

String description() default "Timing method";

}
```

**Using the annotation:**

```java
@LogExecutionTime(description = "Loading users")

public List\<User\> getAllUsers() { ... }
```

### Meta-Annotations

- @Retention - how long annotation is retained (SOURCE, CLASS, RUNTIME)

- @Target - where annotation can be applied (METHOD, FIELD, TYPE, etc.)

- @Documented - include in Javadoc

- @Inherited - subclass inherits parent's annotation

### Annotations in Frameworks

- Spring: @Autowired, @Component, @RestController, @RequestMapping

- JPA/Hibernate: @Entity, @Table, @Column, @Id

- JUnit: @Test, @BeforeEach, @AfterEach

> *💡 Tip: Annotations are the backbone of modern Java frameworks. Understanding them is essential for Spring Boot development.*


## 25. Event Management Usecase

### Purpose

Before diving deep into OOP concepts, this use case ties together classes, objects, fields, and methods in a real-world scenario.

### Scenario: Event Registration System

**Code Example:**

```java
package com.training.events;

public class Event {

private String eventName;

private String date;

private int capacity;

private int registrations = 0;

public Event(String name, String date, int capacity) {

this.eventName = name;

this.date = date;

this.capacity = capacity;

}

public boolean register(String participantName) {

if (registrations \< capacity) {

registrations++;

System.out.println(participantName + " registered for " + eventName);

return true;

}

System.out.println("Event full!");

return false;

}

public void showStatus() {

System.out.println(eventName + " | " + registrations + "/" + capacity);

}

}
```

### Key OOP Concepts Demonstrated

- Encapsulation: Fields are private, accessed via methods

- Object creation: new Event(...)

- Method calls: register(), showStatus()

- Business logic within methods


---

## ⚙️ PHASE 6: Concurrency & Memory

---


## 26. Multithreading

### What Is Multithreading?

Multithreading allows concurrent execution of two or more parts of a program to maximize CPU utilization. Each part is called a thread.

> *🔎 Real-World Analogy: A restaurant with one chef (single-threaded) can cook only one dish at a time. A restaurant with multiple chefs (multi-threaded) can prepare several dishes simultaneously.*

### Creating Threads - Two Ways

## 1. Extending Thread class

**Code Example:**

```java
public class MyThread extends Thread {

@Override

public void run() {

System.out.println("Thread: " + Thread.currentThread().getName());

}

}

new MyThread().start();
```

## 2. Implementing Runnable (preferred)

**Code Example:**

> public class MyTask implements Runnable {
> 
> @Override
> 
> public void run() {
> 
> System.out.println("Running in: " + Thread.currentThread().getName());
> 
> }
> 
> }
> 
> Thread t = new Thread(new MyTask());
> 
> t.start();
> 
> *💡 Tip: Prefer Runnable over extending Thread - it allows your class to extend another class, and separates the task from the thread management.*

### Thread Lifecycle

- New - Thread created but not started

- Runnable - After start(), ready to run

- Running - CPU is executing the thread

- Blocked/Waiting - Waiting for a lock or signal

- Terminated - run() completed or stopped

### Thread Synchronization

When multiple threads access shared data, race conditions can occur. Use synchronized to allow only one thread at a time.

**Code Example:**

```java
public class Counter {

private int count = 0;

public synchronized void increment() {

count++;

}

}
```

### Common Thread Methods

- start() - begins execution of a thread

- sleep(ms) - pauses thread for given milliseconds

- join() - waits for another thread to finish

- interrupt() - signals a thread to stop

- yield() - hints to scheduler to give other threads a turn


## 27. Executor Framework Quick Start

### Why Executor Framework?

Creating a new Thread for every task is expensive. The Executor Framework provides thread pool management, making concurrent programming safer, simpler, and more efficient.

> *🔎 Real-World Analogy: Instead of hiring a new employee for every small task (costly), you have a pool of employees (thread pool). When a task arrives, an available employee handles it.*

### ExecutorService

**Code Example:**

```java
import java.util.concurrent.\*;

ExecutorService executor = Executors.newFixedThreadPool(3);

for (int i = 1; i \<= 5; i++) {

final int taskId = i;

executor.submit(() -\> {

System.out.println("Task " + taskId + " by " + Thread.currentThread().getName());

});

}

executor.shutdown(); // gracefully shut down
```

### Types of Thread Pools

- newFixedThreadPool(n) - fixed number of threads

- newCachedThreadPool() - grows/shrinks as needed

- newSingleThreadExecutor() - one thread, tasks execute sequentially

- newScheduledThreadPool(n) - for delayed or periodic tasks

### Future and Callable

Callable is like Runnable but returns a result. Future holds the result of an async computation.

**Code Example:**

```java
Callable\<Integer\> task = () -\> { return 42; };

Future\<Integer\> future = executor.submit(task);

int result = future.get(); // blocks until result is available

System.out.println("Result: " + result);
```


## 28. Garbage Collection & Types of Objects

### What Is Garbage Collection?

Java automatically reclaims memory occupied by objects that are no longer reachable. This is done by the Garbage Collector (GC) running in the background.

> *🔎 Real-World Analogy: Think of GC as a janitor who automatically cleans up tables (memory) as soon as customers (references) leave - you don't need to clean up manually.*

### Types of Object References

- Strong Reference - default. Object NOT garbage collected as long as reference exists

- Weak Reference - GC can collect even if reference exists (WeakReference class)

- Soft Reference - collected only under memory pressure (SoftReference class)

- Phantom Reference - for cleanup before object is collected

### How GC Works

- Mark phase - identifies all reachable objects

- Sweep phase - reclaims unreachable (dead) objects

- Compact phase - defragments the heap (in some GCs)

### GC Generations

- Young Generation (Eden + Survivor spaces) - newly created objects

- Old Generation (Tenured) - long-lived objects promoted from young gen

- Metaspace (Java 8+) - class metadata (replaced PermGen)

### Requesting GC (Not Recommended)

> System.gc(); // just a suggestion, JVM may ignore it
> 
> *💡 Tip: Never rely on System.gc(). Design your code to minimize object creation and let the JVM manage memory.*

**finalize() Method (Deprecated)**

finalize() was called before GC collected an object. Deprecated in Java 9, removed in Java 18. Use try-with-resources or Cleaners instead.


---

## 🚀 PHASE 7: Modern Java

---


## 29. Java 8 Features

### Lambda Expressions

Lambda is a concise way to represent an anonymous function (a block of code that can be passed around). It enables functional programming in Java.

> *🔎 Real-World Analogy: A lambda is like a sticky note with instructions. Instead of writing a full formal letter (anonymous class), you write a quick note (lambda).*

### Syntax: (parameters) -\> expression or { body }

**Before Java 8 (Anonymous class):**

```java
Runnable r = new Runnable() {

public void run() { System.out.println("Hello"); }

};
```

**With Lambda (Java 8):**

```java
Runnable r = () -\> System.out.println("Hello");
```

### Functional Interfaces

An interface with exactly one abstract method. Lambdas can be used anywhere a functional interface is expected.

- Runnable - () -\> void

- Callable\<T\> - () -\> T

- Comparator\<T\> - (T, T) -\> int

- Predicate\<T\> - T -\> boolean

- Function\<T,R\> - T -\> R

- Consumer\<T\> - T -\> void

- Supplier\<T\> - () -\> T

### Stream API

Streams provide a functional approach to processing collections - filter, map, reduce, etc. Streams are lazy and can be parallel.

**Code Example:**

```java
List\<String\> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");

List\<String\> result = names.stream()

.filter(n -\> n.startsWith("A")) // filter

.map(String::toUpperCase) // transform

.sorted() // sort

.collect(Collectors.toList()); // collect

System.out.println(result); // [ALICE, ANNA]
```

### Method References

Shorthand for lambdas that just call a method.

```java
names.forEach(System.out::println); // instead of n -\> System.out.println(n)

names.stream().map(String::toUpperCase); // instead of s -\> s.toUpperCase()
```

### Optional

A container object that may or may not contain a non-null value. Avoids NullPointerException.

**Code Example:**

```java
Optional\<String\> opt = Optional.ofNullable(getName());

String name = opt.orElse("Unknown");

opt.ifPresent(n -\> System.out.println("Name: " + n));
```

### Default Methods in Interfaces

Interfaces can now have method implementations using the default keyword. This allows adding new methods to interfaces without breaking existing implementations.

```java
interface Greeting {

default void greet() { System.out.println("Hello!"); }

}
```

### Date and Time API (java.time)

> LocalDate today = LocalDate.now();
> 
> LocalDate birthday = LocalDate.of(2000, Month.MAY, 15);
> 
> LocalDateTime now = LocalDateTime.now();
> 
> Duration d = Duration.between(startTime, endTime);
> 
> *💡 Tip: Always use java.time (Java 8+) instead of the old java.util.Date and Calendar classes.*


## 30. HTTP Client API (Java 11+)

### What Is the Java HTTP Client?

Introduced in Java 11, the java.net.http package provides a modern HTTP client that supports HTTP/1.1 and HTTP/2, both synchronous and asynchronous requests.

> *🔎 Real-World Analogy: Think of it as Java's built-in Postman - you can send GET, POST, and other HTTP requests directly from Java without needing external libraries like Apache HttpClient.*

### Sending a GET Request

**Code Example:**

```java
import java.net.http.\*;

import java.net.URI;

HttpClient client = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()

.uri(URI.create("https://api.example.com/users"))

.GET()

.build();

HttpResponse\<String\> response = client.send(

request, HttpResponse.BodyHandlers.ofString()

);

System.out.println("Status: " + response.statusCode());

System.out.println("Body: " + response.body());
```

### Sending a POST Request

**Code Example:**

```java
HttpRequest postRequest = HttpRequest.newBuilder()

.uri(URI.create("https://api.example.com/users"))

.header("Content-Type", "application/json")

.POST(HttpRequest.BodyPublishers.ofString("{\\name\\:\\Alice\\}"))

.build();
```

### Async Request

**Code Example:**

```java
client.sendAsync(request, HttpResponse.BodyHandlers.ofString())

.thenApply(HttpResponse::body)

.thenAccept(System.out::println)

.join();
```


## 31. Java 13 and 14 Features

### Java 13 Features

### Text Blocks (Preview in 13, Standard in 15)

Text blocks make multi-line strings readable without escape characters.

**Before:**

```java
String json = "{\n \\name\\: \\Alice\\,\n \\age\\: 30\n}";
```

**With Text Block:**

```java
String json = """

{

"name": "Alice",

"age": 30

}

""";
```

### Switch Expressions (Preview in 13)

More concise switch that returns a value.

```java
String result = switch (day) {

case MONDAY, FRIDAY -\> "Working day";

case SATURDAY, SUNDAY -\> "Weekend";

default -\> "Other";

};
```

### Java 14 Features

### Records (Preview)

Records are concise immutable data carrier classes. Java auto-generates constructor, getters, equals, hashCode, and toString.

**Before (traditional):**

```java
public class Point {

private final int x, y;

public Point(int x, int y) { this.x = x; this.y = y; }

public int x() { return x; }

public int y() { return y; }

// equals, hashCode, toString...

}
```

**With Record:**

```java
public record Point(int x, int y) {}

// Gives you all of the above automatically!
```

### Pattern Matching for instanceof (Preview)

**Before:**

```java
if (obj instanceof String) {

String s = (String) obj;

System.out.println(s.length());

}
```

**With Pattern Matching:**

```java
if (obj instanceof String s) {

System.out.println(s.length()); // s is already cast!

}
```

### Helpful NullPointerExceptions

Java 14 improved NPE messages to tell you exactly which variable was null, making debugging much faster.

> // Before: NullPointerException (confusing)
> 
> // Java 14: Cannot invoke 'String.length()' because 'str' is null
> 
> *💡 Tip: Java features evolve continuously. Keeping up with LTS releases (Java 11, 17, 21) is important in professional development.*

### Summary: Core Java at a Glance

The following table summarizes all Core Java topics covered in this courseware:

|        |                                  |                                                    |
|--------|----------------------------------|----------------------------------------------------|
| **\#** | **Topic**                        | **Key Takeaway**                                   |
| 1      | **Intro to Java & OOP**          | WORA principle, 4 pillars of OOP                   |
| 2      | **Installation & First Program** | JDK/JRE/JVM, HelloWorld, compile & run             |
| 3      | **Static Members**               | Class-level members, static block, execution order |
| 4      | **Non-Static Members**           | Instance fields, methods, this, constructors       |
| 5      | **Data Types & Variables**       | 8 primitives, widening/narrowing, type promotion   |
| 6      | **Wrapper Classes**              | Autoboxing, unboxing, Integer.parseInt()           |
| 7      | **Operators**                    | Arithmetic, relational, logical, ternary           |
| 8      | **Flow Control**                 | if/else, switch, for, while, break, continue       |
| 9      | **Access Modifiers**             | public, protected, default, private                |
| 10     | **Packages**                     | Namespacing, import, reverse-domain naming         |
| 11     | **Event Mgmt Usecase**           | OOP applied in a real scenario                     |
| 12     | **Inheritance**                  | extends, super, overriding, @Override              |
| 13     | **Abstraction**                  | abstract class, interface, default methods         |
| 14     | **Polymorphism**                 | Overloading, overriding, runtime dispatch          |
| 15     | **Encapsulation**                | Private fields, getters/setters, JavaBeans         |
| 16     | **Exception Handling**           | try-catch-finally, checked/unchecked, custom       |
| 17     | **Multithreading**               | Thread, Runnable, lifecycle, synchronized          |
| 18     | **Executor Framework**           | Thread pools, Future, Callable                     |
| 19     | **Garbage Collection**           | GC algorithms, strong/weak/soft references         |
| 20     | **Inner Classes**                | Regular, static nested, local, anonymous           |
| 21     | **String Handling**              | Immutability, pool, StringBuilder, methods         |
| 22     | **IO Streams**                   | Byte/char streams, BufferedReader, NIO             |
| 23     | **Arrays**                       | 1D/2D, Arrays utility, for-each                    |
| 24     | **Object Class**                 | equals(), hashCode(), toString()                   |
| 25     | **Collections & Generics**       | List, Set, Map, Comparable, Comparator             |
| 26     | **Enums**                        | Type-safe constants, methods, switch               |
| 27     | **Java 8 Features**              | Lambdas, Streams, Optional, Date/Time API          |
| 28     | **JVM Architecture**             | ClassLoader, Heap, Stack, JIT, GC                  |
| 29     | **Annotations**                  | Built-in, custom, meta-annotations, frameworks     |
| 30     | **Interview Questions**          | Top Q&A covering all topics                        |
| 31     | **HTTP Client API**              | Java 11+ HTTP client, sync/async requests          |
| 32     | **Java 13 & 14 Features**        | Text blocks, records, pattern matching, switch     |


---

## 🎯 PHASE 8: Interview Preparation

---


## 32. Core Java - Interview Questions

### Frequently Asked Questions

### OOP Concepts

- What is the difference between abstraction and encapsulation?

- Can an abstract class have a constructor?

- What is the difference between interface and abstract class in Java 8?

- What is method overloading vs overriding? What is the difference?

- Can we override static methods? (No - they are hidden, not overridden)

- What is covariant return type?

### Core Java

- Why is String immutable in Java?

- What is the difference between == and .equals()?

- What happens if you override equals() but not hashCode()?

- What is the difference between ArrayList and LinkedList?

- What is the difference between HashMap and Hashtable?

- What is fail-fast vs fail-safe iterator?

- What is the difference between Comparable and Comparator?

### Memory and JVM

- What is the difference between Stack and Heap memory?

- What is a memory leak in Java? Can Java have memory leaks?

- What is the difference between JDK, JRE, and JVM?

- What is the role of ClassLoader?

### Exceptions

- What is the difference between checked and unchecked exceptions?

- What is the difference between throw and throws?

- Can we have a try block without catch?

- What happens if an exception is thrown in finally block?

### Java 8

- What is a lambda expression? What is a functional interface?

- What is the difference between map() and flatMap() in streams?

- What is Optional and why is it used?

- What is a default method in interface? Why was it introduced?

### Multithreading

- What is the difference between process and thread?

- What is a race condition? How do you prevent it?

- What is deadlock? How do you avoid it?

- What is the difference between synchronized method and synchronized block?

- What is volatile keyword used for?
