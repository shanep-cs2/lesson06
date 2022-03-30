# lesson06 - Overriding member methods

## Overview

In this lab we are going to create two classes. Our base class will be Book.java and our derived
classes will be Fiction.java. Our Book class will define the properties that are common to all
books such as the **title** and **author** while our  derived class will add in additional
properties that are specific to that type of book. There is also a class named App.java that has
our main method that we can use to run any manual tests.

## Important links

- [Lab Overview]()
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)

## Learning Objectives

- Create a derived class from a base class
- Use the super keyword to invoke methods
- Explore how a simple inheritance hierarchy works

## Task 1 - Write Unit tests

Our first task is to write our tests! There are two classes that need to be completed
FictionTest.java and BookTest.java. Examples have already been completed to help guide you.

## Task 2 - Implement the Fiction Class

For the Fiction class you will need to extend the Book class and add the following property.

```java
    /**
     * The genre of fiction. Science, Fantasy, Romance, etc.
     */
    private String genre;
```

You will then need to define getters and setters for the `genre` property with the names `getGenre`
and `setGenre`. Within the derived Fiction class, define a getBookInfo() method that overrides the
Book class' getBookInfo() method and add the books `genre` to the output. You are required to use
the `super` keyword in the derived Fiction class, you can't just copy and paste the code from the
Book class.


## Task 3 - System testing

The final task is to do some simple system testing to make sure everything looks OK. We will use a cool
feature of the terminal called
[redirections](https://www.gnu.org/software/bash/manual/html_node/Redirections.html) to have our
program read from a file without having to type everything in by hand. Unlike Unit testing where
we are just testing one method at a time a system test will make sure all the components all
work together well. 

