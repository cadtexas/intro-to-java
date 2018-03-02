# Strings
Primitive data types may be add complexity to your program, but most likely,
you will need to work with Strings for some of the stuff you'd like to do.
Strings allow you to represent data in "text", allowing you to print and
receive messages from interfaces, and manipulate them however you'd like.
Before we dive into this topic, however, we'll review material from the last
workshop.

## Review
Combining loops with arrays is a powerful tool to help you navigate your way
through an assortment of data. Try downloading the [Arrays
Review][ArraysReview] file and placing it in a Eclipse Java project. Go through
the code and see if you're able to understand the presented topics.

## Strings Introduction
While Strings might look like primitive data types and seem to be declared
similarly, they have important differences.
1. Strings are part of the Object class in Java. This explains the behavior of
   other qualities in this list.
2. Strings are immutable - they cannot be changed directly. If, for instance,
   you wanted to change the last letter of a string, you would have to create a
   new string with the modified last letter. There is no way to make changes on
   the original string.
3. Strings are actually memory addresses - we won't dive too deeply into this,
   but this is why comparing new strings with the `==` operator will cause an
   unexpected `false`.

## Creating Strings
There are two ways to create a String. Most of the time, we will be creating
them with the second method shown below.
##### Formal:
```java
String myString = new String("This is my string!");
```
##### Shortcut:
```java
String myString = "This is my string!";
```

## Concatenation
Concatenation just means that you want to combine strings. This is done with
the `+` operator. For example:
```java
String combinedString = "I want to combine this string" + " " + "with this string!";
```
Be careful to differentiate when to use the `+` operator. When used with 2
integers, `+` will mean addition. When encountering a string, however, `+` will
change to mean concatenation.

## equals()
Like we mentioned above, we cannot directly compare two `String` objects with
the `==` operator. We will end up comparing the memory addresses of the two,
and since each new `String` that we create is stored in a different location,
it will never return `true`. Instead, we will use the `equals()` method to
compare the contents of the two `Strings`. All `Strings` are case sensitive.
This method will return `true` if the strings are equivalent and `false` otherwise.
```java
String s1 = "equivalent";
String s2 = "equivalent";
String s3 = "Equivalent";
s1.equals(s2); //returns true
s1.equals(s3); //returns false
```

## length()
This method returns how many letters are in a given `String`.
```java
String s1 "Hello world!";
s1.length(); //returns 12
```
Notice how this differs from the array length. When trying to get an array's
length, you call `arr.length`. However, with a string, you will call
`str.length()` with the parentheses.

## indexOf(String str)
This method returns the index of the first instance of a provided `String` or
`char`. If the provided argument doesn't exist, it will return `-1`.
```java
String str = "hello world";
str.indexOf("hell"); //returns 0
str.indexOf('o'); //returns 4
str.indexOf("a"); //returns -1
```

## charAt(int index)
This method returns the `char` at the specified index of the `String`.
```java
String str = "computer science";
str.charAt(0); //returns 'c'
str.charAt(9); //returns 's'
```

## contains(String str)
This method returns `true` if `String` contains the specified `String` or
`char`; returns `false` if it doesn't.
```java
String s = "hello world";
s.contains("hell"); //returns true
s.contains('o'); //returns true
s.contains("a"); //returns false
```

## substring(int startIndex, int endIndex)
This method returns a new `String` of [startIndex, endIndex). You can also put
just one index between the parentheses, and it will return from the specified
index to the end of the string.
```java
String str = "hello world";
str.substring(0,5); //returns "hello"
str.substring(6); //returns "world"
```

## Index out of Bounds Error
When working with `Strings` and arrays, you may occasionally encounter the
IndexOutOfBounds error. This is probably because you are attempting to access
an element of the `String` or array that is outside of the defined value. Most
likely, your error will be at the last letter of the string or the last element
of the array. Remember that these are both have 0-indexing, so the last element
is accessed by `length-1` of the `String` or array.

## Practice with Strings
You can do some more practice with `Strings` with our [Strings][Strings] file
in the same folder. Be sure to understand the code!

[ArraysReview]: ArraysReview.java
[Strings]: Strings.java
