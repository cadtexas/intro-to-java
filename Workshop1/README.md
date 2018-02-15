# Introduction to Java

This workshop will cover Java, a popular object-oriented programming language,
from the basics to intermediate object-oriented concepts. The course is fast
paced and recommended for those who have a little bit of experience already. If
you are a complete beginner we recommend the Intro to Python workshop.

## Installing Java and Eclipse

Eclipse is the Integrated Development Environment (IDE) where we will be
writing our Java code.

### Windows and Mac

1. Download Java from [here][jdk]
2. Select Windows x86 if your computer is 32-bit or Windows x64 if your
   computer is 64-bit
3. Double-click the downloaded file and follow the prompts to install Java
4. Download Eclipse from [here][eclipse]
5. Under Get Eclipse click the orange button, it should download the appropriate
   version
6. Double-click the downloaded file and select Eclipse IDE for Java Developers
7. Press Install and follow the prompts.
8. You can now open Eclipse and run the example Hello, world! program

### Linux (Ubuntu)

1. Install Java by running the following
```
sudo apt-get install openjdk-8-jdk
```
2. Install Eclipse by following this [tutorial][ubuntu]

[jdk]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[eclipse]: http://www.eclipse.org/downloads/
[ubuntu]: https://askubuntu.com/questions/695382/how-to-install-eclipse-using-its-installer

## Hello World

1. From the Welcome screen press *Create a Hello World application*
2. Follow the steps on the right
3. Once done you should see this in your editor
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```

The first line of code denotes the name of your program. It should be the same
as the file your program is in. We will learn more about `public class` later
in the workshop.
```java
public class HelloWorld { // Should be in a file called HelloWorld.java
```
The second line of code denotes the starting point for your code. It is always
as follows. We learn more about it later.
```java
public static void main(String[] args) {
```
Both of these lines have to have a matching curly brace to denote the end of
each section. Like this
```java
public static void main(String[] args) {
}// This is the matching curly brace
```
The third line of code is what prints "Hello world" to the screen, without the
quotes.
```java
System.out.println("Hello world");
```
You can print anything with this line. Whatever you want on the screen will go
within the quotes
```java
System.out.println("Anything!"); // Anything!
```
Every line of code needs a ';' otherwise your code won't work!

You may have noticed that some lines we put `//` followed by some text. This is
a comment and lets you describe what is happening. There are also mult-line
comments.
```java
// Regular comment
/* 
  Multi-line
  comment
*/
```

## Primitive data types

In Java, there are 8 primitive data types.

|Data Type|Description                 |Example|
|---------|----------------------------|-------|
|boolean  |true or false               |true   |
|byte     |holds small numbers, 8 bits |64     |
|char     |holds letters               |'a'    |
|short    |hold slightly larger numbers|2345   |
|int      |holds large numbers         |1231232|
|long     |holds even large numbers    |2322L  |
|float    |holds decimal numbers       |23.2f  |
|double   |holds decimal numbers       |23.2   |

They are used when defining variables so we know what is inside them.
```java
int x = 12;
int y = x + 14;
System.out.println(y); // Prints 26 to the screen
```

## Bonus: Reading user input

This topic is a little advanced since it requires knowledge from later in the
course but is usually necessary to make useful programs.
```
Scanner in = new Scanner(System.in)
int x = in.nextInt();
System.out.println(x);
```
Here we are creating what we call a Scanner object. Scanner is another data
type but it was defined by someone else. We put `System.in` in the paretheses
to denote we are reading from the user.
```
int x = in.nextInt();
```
`.nextInt()` is a function that reads a number from the user in format of
`int`. The user's number gets put into the x variable. We then print to the
screen so we know it was read.

There are functions for all the primite data types as well as String, which
holds text.
```
double y = in.nextDouble(); // Reads the next double
String s = in.nextLine(); // Reads the whole line in the format of String
```
