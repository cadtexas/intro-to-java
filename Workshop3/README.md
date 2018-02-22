# Arrays

As a college student (or otherwise) you have opened Excel before and made some
sort of spreadsheet, whether for a simple graph or complicated equations. How
do you think that program is able to store the data from all those cells? Does
it have thousands of individual variables? Clearly that wouldn't be vary
pratical. Arrays allow you to declare a large amount of space to put data in
one go. Before we start learning about them we need to reinforce last
workshop's topic's.

## Review

Download the [Conditionals][conditionals] file and place it in a Eclipse
Java project. Try the exercises, we will walk around to help you, or if you 
are reading this after the workshop, here is the [solution][solution].

## One-dimensional arrays
```java
int[] array = new int[3];
array[0] = 2;
array[1] = 100;
array[2] = -1;
```
The `[]` or brackets you see are what declares an array variable. You may have
notice them before in main method header.
```java
public static void main(String[] args)
```
They declare an array variable allowing them to hold an array. In other words,
they are a modifier that creates a new data type. In this case, from the `int`
data type to `int[]` data type. It important to remember that those are
different types. For example, the following does not compile.
```java
int[] array = 2; // Because 2 is not an array
```
We know how to declare an array but how do we instantiate (or create) one? To
create an array we need to know how much space we want or how many "slots" we
want.
```java
new int[3];
```
3 is how much space or _length_ we want. Any expression which evaluates to the
`int` data type is allowed here.

The new keyword means we want to allocate (ask for) memory. We always want this
because we are creating a new array.
```java
array[0] = 2;
System.out.println(array[0]); // Prints 2
```
Now that we have an array we need to be able to store and retrieve data in it.
The brackets or `[]` again are used here, but instead we pass a `int` to denote
which position we want in the array. In Java, we call this an index and we
start counting at zero.

When representing arrays in comments or printing, we display them as follows.
You can have Java do this for you as well.
```java
System.out.println(Arrays.toString(array)); // Prints [2, 100, -1]
```
To be able to use this function, you'll want to import Arrays at the top of
your code.
```java
import java.util.Arrays;
```
This [Arrays][arrays] library also has other useful functions you may want to
look at.

## Two-dimensional arrays and beyond

We answered the question of how to store large amounts of data in one go but
how does Excel have a grid of cells? Java allows us to create 2D arrays and
beyond, letting us create grids or matrices.
```java
int[][] array2D = new int[2][2];
int[0][0] = 0;
int[0][1] = 1;
int[1][0] = 2; // [[0, 1],
int[1][1] = 3; //  [2, 3]]
```
Again with brackets or `[]` we are able to add additional dimensions to our
array variable. When instatiating we give the length of each dimension. And
when accessing and modifying we give the index in each dimension.

Printing the array requires a slightly different function which prints every
dimension of an array.
```java
System.out.println(Arrays.deepToString(array2D));
```
2D arrays work by making an array of arrays per say. As we mentioned earlier
an array is an additional data type i.e. `int[]` we modify this data type by
adding another brackets, in other words an array of type `int[]` which is data
type `int[][]`

This array of arrays idea allows to be flexible with defining lengths. We can
create a jagged array, an array of arrays with varying lengths, by omitting the
second dimensions's length.
```java
int[][] arrayJagged = new int[2][];
int[0] = new int[10];
int[1] = new int[5];
```
Since we don't define the length of the arrays in the second dimension we need
to manually create arrays for those respective rows.

Finally to save some time Java has a shorthand syntax for entering data into an
array. Instead of modifiying every index after instatiation, when instatiating
we can set the initial values in one go.
```java
int[] array = {1, 2, 3}; // array with length 3 and those values

int[] array2D = { {0, 1}, {2, 3} }; // 2 by 2 2D array with those values

// jagged array with a row of length 10 and one of 5
int[] arrayJagged = { new int[10], new int[5] }; 
```
As you can see they can be nested and jagged arrays work as well. If you have
already declared and instatiated a variable you can still use this syntax, but
you need to add the new keyword. This of course creates new memory and tell
Java to switch to it. The old array/memory is eventually freed by Java
automatically.
```java
array = new int[]{2, 2, 2, 2}; // since array variable already exists
```

[arrays]: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
[conditonals]: Conditionals.java
[solution]: solution/Conditionals.java
