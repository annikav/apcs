/*
* Lesson 32 Coding Activity 2
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the number of days in the month. Assume that February 
* will always have 28 days for this activity. 
* 
* This method must be called monthDays()and it must take a integer parameter. 
* 
* Calling monthDays(2) would print 28 and monthDays(9) would print 30.
* 
*/


import java.util.Scanner;

class Lesson_32_Activity_Two {
         
    public static void monthDays (int n) {
        int numDays;
        if ((n == 1) || (n == 3) || (n == 5) || (n == 7) || (n == 8) || (n == 10) || (n == 12)){
          numDays = 31;
        } else if (n == 2) {
          numDays = 28;
        } else {
          numDays = 30;
        }
        System.out.println(numDays);
    }
    
    public static void main(String[] args) {
    }
}
