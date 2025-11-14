Java Interfaces Example
This project contains a sample Java program demonstrating how a class implements two interfaces which both have the same method signature.

Code Explanation
Two interfaces printable and showable are declared, both having the method display().

The document class implements both interfaces and overrides the display() method.

In the day8 class, we create an instance of document and call the display() method, which prints "class c".

How to Run
Save both classes (document and day8) in the same directory or file named day8.java.

Compile the code using:

bash
javac day8.java
Run the main class:

bash
java day8
Expected output:

text
class c
