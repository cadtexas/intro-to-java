import java.util.Scanner;
import java.util.Random;

public class Conditionals {

  public static void main(String[] args) {

//    ifStatement();
//    switchStatement();
//    whileLoop();
//    forLoop();
//    checkSum();
//    dayOfTheWeek();
//    mileToKm();
//    smallNum();
//    coinFlip();
//    perfectNums();

  }

  public static void ifStatement() {

    /* Write an if statement that will check if a number is
     * less than, more than, or equal to another number.
     */

    int i = 10;
    int j = 100;

    if (i < j) {
      System.out.println(i + " is less than " + j);
    }
    else if (i > j) {
      System.out.println(i + " is more than " + j);
    }
    else {
      System.out.println(i + " is equal to " + j);
    }

  }

  public static void switchStatement() {

    /* Write a switch statement that will take in a
     * month number and return the month name.
     */

    int monthNumber = 5;
    String monthName = "";

    switch (monthNumber) {
    case 1:
      monthName = "January";
      break;
    case 2:
      monthName = "February";
      break;
    case 3:
      monthName = "March";
      break;
    case 4:
      monthName = "April";
      break;
    case 5:
      monthName = "May";
      break;
    case 6:
      monthName = "June";
      break;
    case 7:
      monthName = "July";
      break;
    case 8:
      monthName = "August";
      break;
    case 9:
      monthName = "September";
      break;
    case 10:
      monthName = "October";
      break;
    case 11:
      monthName = "November";
      break;
    case 12:
      monthName = "December";
      break;
    }
    System.out.println("This month is " + monthName);

  }

  public static void whileLoop() {

    /* Write a while loop to find the greatest common
     * divisor for a number.
     */

    int num = 75;
    int x = 1;
    int gcd = 1;

    while(x < num) {
      if(num % x == 0) {
        gcd = x;
      }
      x++;
    }

    System.out.println("The greatest common divisor of " + num + " is " + gcd);

  }

  public static void forLoop() {

    /* Write a for loop to find the sum of the first
     * n integers.
     */


    int range = 50;
    int sum = 0;

    for(int k = 1; k < range; k++) {
      sum = sum + k;
    }
    System.out.println("The sum of the first " + range + " numbers is " + sum);

  }

  /* 1. Write a program that generates two integers under 100 and prompts the user
   * to enter the sum of these two integers. The program then reports true if the
   * answer is correct, false otherwise.
   */

  public static void checkSum() {

    // We must import java.util.concurrent.ThreadLocalRandom
    // nextInt(min, max + 1) gives a random number from min to max
    // If we want a 0 or a 1 randomly we must use nextInt(0, 1 + 1)
    int n1 = ThreadLocalRandom.current().nextInt(0, 101);
    int n2 = ThreadLocalRandom.current().nextInt(0, 101);
    int sum = n1 + n2;
    int guess = 0;

    // We must import java.util.Scanner;
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a guess for the sum: ");
    guess = reader.nextInt();
    reader.close();

    if(guess == sum) {
      System.out.println("That's right!");
    }
    else {
      System.out.println("Sorry, but that's not the answer");
      System.out.println("The sum was " + sum);
    }

  }

  /* 2. Write a program that prompts the user to enter an integer for today's day of
   * the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the
   * user to enter the number of days after today for a future day and display
   * the future day of the week. Here is a sample run:
   *
   * Enter today's day: 1
   * Enter the number of days elapsed since today: 3
   * Today is Monday and the future day is Thursday
   */

  public static void dayOfTheWeek() {

    int numDay = 0;
    int numDays = 0;
    String nameDay = "";
    String nameFutureDay = "";

    // We must import java.util.Scanner;
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter today's day: ");
    numDay = reader.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    numDays = reader.nextInt();
    reader.close();

    int futureDay = (numDay + numDays) % 7;

    switch(numDay) {
    case 0:
      nameDay = "Sunday";
      break;
    case 1:
      nameDay = "Monday";
      break;
    case 2:
      nameDay = "Tuesday";
      break;
    case 3:
      nameDay = "Wednesday";
      break;
    case 4:
      nameDay = "Thursday";
      break;
    case 5:
      nameDay = "Friday";
      break;
    case 6:
      nameDay = "Saturday";
      break;
    }


    switch(futureDay) {
    case 0:
      nameFutureDay = "Sunday";
      break;
    case 1:
      nameFutureDay = "Monday";
      break;
    case 2:
      nameFutureDay = "Tuesday";
      break;
    case 3:
      nameFutureDay = "Wednesday";
      break;
    case 4:
      nameFutureDay = "Thursday";
      break;
    case 5:
      nameFutureDay = "Friday";
      break;
    case 6:
      nameFutureDay = "Saturday";
      break;
    }

    System.out.println("Today is " + nameDay + " and the future day is " + nameFutureDay);

  }

  /* 3. Write a program that displays the folowing table (note that 1 mile is
   * 1.609 kilometers):
   *
   * Miles    Kilometers
   * 1      1.609
   * 2      3.218
   * ...
   * 9      15.481
   * 10   16.090
   */

  public static void mileToKm() {

    System.out.println("Miles\tKilometers");

    for(int i = 1; i <= 10; i++) {

      System.out.println(i + "\t" + i * 1.609);

    }
  }

  /* 4. Use a while loop  to find the smallest integer n such that n^2 is greater
   * than 12,000. Use a while loop to find the largest integer n such that n^3 is
   * less than 12,000.
   */

  public static void smallNum() {

    int n = 0, smallest = 0;

    while(n * n < 12000) {

      smallest = n;
      n++;

    }

    System.out.println("The smallest number is " + smallest);

  }

  /* 5. Write a program that simulates flipping a coin one million times and
   * displays the number of heads and tails.
   */

  public static void coinFlip() {

    int heads = 0, tails = 0;

    for(int i = 0; i < 1000000; i++) {

      // We must import java.util.Random
      // nextInt(min, max + 1) gives a random number from min to max
      // If we want a 0 or a 1 randomly we must use nextInt(0, 1 + 1)
      Random rand = new Random();
      int randomNum = rand.nextInt(1 + 1);

      if (randomNum == 0) {
        heads++;
      }
      else {
        tails++;
      }
    }

    System.out.println("The number of heads is " + heads + " and the number of tails is " + tails);

  }

  /* 6. A positive number us called a perfect number if it is equal to the sum of
   * all of its positive divisors, excluding itself. For example, 6 is the first
   * perfect number, because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
   * There are four perfect numbers less than 10,000. Write a program to find
   * these perfect numbers.
   */

  public static void perfectNums() {

    int sumOfDivisors = 0;

    for(int i = 1; i <= 10000; i++) {
      for(int j = 1; j < i; j++) {
        if(i % j == 0) {
          sumOfDivisors = sumOfDivisors + j;
        }
      }
      if(sumOfDivisors == i) {
        System.out.println(i);
      }
      sumOfDivisors = 0;
    }
  }
}
