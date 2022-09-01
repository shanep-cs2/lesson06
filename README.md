# lesson06 - Overriding member methods

## Overview

In this lab we are going to create a derived class and override some methods. Our base class will be
Book.java and our derived class will be Fiction.java. Our Book class will define the methods that
are common to all books but will just output the string "none" whenever the methods are called. In
your derived class Fiction you will override those methods and return the correct data.

## Important links

- [Lab Overview](https://youtu.be/mT-DN8VaKwc)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

## Learning Objectives

- Create a derived class from a base class
- Explore how a simple inheritance hierarchy works
- Explore how to program without ever writing a **main** function!

## Task 1 - Implement the Fiction Class

For the Fiction class you will need to extend the Book class and **override** all the methods and
return the correct data for a Fiction class. You may have to add some **private** instance variables
to the Fiction class to store your data.

Additionally you will need to add a constructor to the Fiction class with the following signature:

```java
Fiction(String ISBN, String author, String title, String genre)
```

## Task 2 - Write Unit tests

Once you have completed implementing the Fiction class we can write some unit tests to make sure
everything works correctly! Example tests in the BookTest.java have already been completed to help
guide you, you will need to complete the FictionTest class.


## Task 3 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 4 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!