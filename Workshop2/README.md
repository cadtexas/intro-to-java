# Conditionals and Loops

Making decisions and repeating code are key tools to creating different
programs. While it may seem simple to the user, coding decisions into Java may,
at times, seem more complicated and unintuitive. However, utilizing these
conditional statements and loops will greatly enhance your code, and it will
assist you in crafting a more complex program.

## Expressions

Before we dive into conditional statements, we must understand expression
evaluation. For each conditional, the program will evaluate an expression that
comes to be either `true` or `false`. With Java, there are several operators to
understand:

1. **AND** - `&&`: When evaluating two truth statements, for the expression to
   evaluate to `true`, _both_ statements must be true. If either, or both
   statements are false, the expression will evaluate to `false`.
2. **OR** - `||`: When evaluating two truth statements, the expression will
   evaluate to `true` if either, or both statements are true. Otherwise, the
   expression will evaluate to `false` (when _both_ statements are false).
3. **NOT** - `!`: This token simply inverts the truth value of a statement.
   For instance if your statement1 is `true`, then !statement1 would be
   `false`, and vice versa.
4. **EQUALS** - `==`: This token will return `true` if the two statements
   you're comparing are the same. It will return `false` when they are
   different. **NOTE:**  this will be used to compare mostly **primitive data
   types** (boolean, char, int, long, etc.) This token will behave differently
   with objects such as _Strings_. We will get into the differences later in
   the course.

## Conditional Statements

Conditional statements help you make decisions. Let's say that you were making
a program that would tell the user if they were old enough to vote, given their
age. Obviously, if their age was >= 18, you'd want to print "yes"; otherwise,
you'd print "no". Being able to specify the correct behavior given an
expression is imperative in good programming.

### If

If statements are formatted as such:
```java
if (expression) {
    <statement>
}
```
If the `expression` evaluates to `true`, the program will execute the statement
within the brackets. If `expression` evaluates to `false`, the program will
skip over the code within the brackets.

### If/Else

If/else statements are formatted as such:
```java
if (expression) {
    <statement1>
}
else {
    <statement2>
}
```
If the `expression` evaluates to `true`, the program will execute the statement
inside the brackets of the `if` (so in the code above, it will execute
`statement1`), and it will skip over whatever is in the `else` brackets. If the
`expression` evaluates to `false`, the program will skip over the code inside
the `if`, and only evaluate whatever is in the `else` brackets (so in our case,
the program will execute `statement2`).

### If/Else if/Else

If/else if/else statements are formatted as such:
```java
if (expression1) {
    <statement1>
}
else if (expression2) {
    <statement2>
}
.
.
.
else {
    <statement3>
}
```
If `expression1` evaluates to `true`, the program will execute `statement1` and
skip over all the other cases. However, if `expression1` is `false`, it will
move on to the next `else if`, and evaluate `expression2`. If `expression2` is
`true`, it will execute `statement2` and skip over all the other cases. This
will continue until you hit the `else` case; if all the other `else if` cases
above fails, you will execute whatever is inside the `else` block (or in our
case, `statement3`).

### Switch

Switch case statements are formatted as such:
```java
switch(value) {
    case val1:  <statement1>
                break;
    case val2:  <statement2>
                break;
    .
    .
    .
    case val8:  <statement8>
                break;
    default:    <statement9>
                break;
}
```
When `value` is equal to `val1`, the program will execute `statement1` and
encounter the `break`, which then "breaks" out of the switch case and not go
through all the other cases. When `value` is equal to `val2`, the program will
execute `statement2`, encounter the `break`, and break out of the switch case.
This will continue for all cases where `value` is equal to `valX`. However, if
`value` is not equal to any of the cases presented, it will go to the `default`
case, execute `statement9`, hit the `break`, and exit the statement.

## Loops

Loops help you repeat pieces of your code that would otherwise be repeatedly
written many times. For instance, maybe you want to write a program to count to
100. You don't want to write 100 print statements to achieve this! Loops can be
incredibly useful in helping you do this.

### For

For loops are formatted as such:
```java
for (int i = startVal; i < endVal; i++) {
    <statement>
}
```
Going through the for loop, `i` first takes the value of `startVal`. It then
checks if it's less than `endVal`. If so, it will execute `statement`; if not,
it will break out of the for loop. Then, `i` will increment by 1, and take the
value of `startVal+1`. Then, `i` will check if it is less than `endVal`; if so,
it will execute `statement`, if not, it will break out of the for loop. The
statement will typically execute `endVal - startVal` times.

### While

While loops are formatted as such:
```java
while (expression) {
    <statement>
}
```
First, `expression` is evaluated. If it evaluates to `true`, then `statement`
will execute, and it will loop to the beginning of the while loop and check
`expression` once again. If `expression` is false, then you break out of the
while loop and don't execute `statement`. Notice how if `expression` is
initially false, `statement` doesn't execute, not even once.

### Do While

Do while loops are formatted as such:
```java
do {
    <statement>
} while (expression);
```
First, `statement` is executed. Then, `expression` is evaluated; if it's
`true`, the program will loop to the beginning of `statement` and execute it.
If it evaluates to `false`, it will break out of the do while loop. Notice how
if `expression` is initially false, `statement` will execute once.
