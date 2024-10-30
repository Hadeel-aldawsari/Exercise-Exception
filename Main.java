import com.sun.jdi.event.ExceptionEvent;

import java.util.IllegalFormatCodePointException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
try {
    System.out.println("Q1) Please enter two number ");
    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
    opertaion(num1, num2);
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}catch (InputMismatchException e){
    System.out.println("you should enter numbers only");
}
        System.out.println("*************************************");

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10
        System.out.println("Q2) Please enter number to display multiplication table ");
        multiplication();
        System.out.println("*************************************");


        //3. Write a Java program to print the area and perimeter of a circle.
        System.out.println("Q3) Please enter Radius to calculate area and perimeter of the circle. ");
        calculateCircle();
        System.out.println("*************************************");

        //4.Java program to find out the average of a set of integers
        System.out.println("Q4) Please enter number to find out the average ");
        calculateAverage();
        System.out.println("*************************************");



        //5 Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
        try {
            checkSumEqualToThird(input);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("*************************************");
        input.nextLine();

        //6). Write a Java program to reverse a word.
        try {
            reverse(input);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("********************");

        //.7) Java program to check whether the given number is even or odd
        System.out.println("Q7)Enter a number ot check it it odd or even:");
        try {
            int odd_or_even = input.nextInt();
            if (odd_or_even == 0) throw new Exception("Zero number");
            System.out.println(odd_or_even % 2 == 0 ? "The number is even" : "The number is odd");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("********************");


        //8)Java program to convert the temperature in Centigrade to Fahrenheit
        try {
            System.out.println("Q8)Enter temperature in Centigrade:");
            double Centigrade = input.nextDouble();
            System.out.println("Temperature in Fahrenheit is: " + ((Centigrade * 1.8) + 32));
            input.nextLine();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("********************");

        //9).Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
        print(input);
        System.out.println("********************");

        //10) Write a Java program to print the area and perimeter of a rectangle.
        rectangle(input);
        System.out.println("********************");

        //11)Write a Java program to compare two numbers.
        try{
        compare(input);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("*******************");

        // Q12)Write a Java program to convert seconds to hours, minutes and seconds.
        try {
            System.out.println("Q12)Enter seconds to convert to hours: minutes: seconds");
            System.out.print("Enter integer seconds : ");
            int seconds = input.nextInt();
            // System.out.println("");
            System.out.printf("%02d:%02d:%02d", (seconds / 3600), (seconds % 3600) / 60, seconds % 60);
        }catch (InputMismatchException e){
            System.out.println("Please enter integer number");
        }
        System.out.println("*******************");

        //Q13)13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.
        try {
            isEquals(input);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("*******************");


        //Q14) Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.
        try{
        checkNumbers(input);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Check numbers methods done");
        }
        System.out.println("*******************");


        //Q15).Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered  (End loop use -1 ,
        //Don’t count -1).
        int zeros=0;
        int nenegative=0;
        int positive=0;
        int number;
        System.out.println("Q15 let determin the number if it 0,-,+");
        try {
            while (true) {
                System.out.println("Enter numbers or -1 to end the game!");
                number = input.nextInt();
                if (number == -1) throw new Exception("-1 Entered to end the loop");
                if (number == 0) zeros++;
                if (number >= 1) positive++;
                if (number < -1) nenegative++;

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(positive+" positive");
        System.out.println(zeros+" zero");
        System.out.println(nenegative+" nenegative");

        System.out.println("*******************");

        //Q16) Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
        reversedDigits(input);
        System.out.println("*******************");

        //Q17) Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.
        findLargestAndSmallest(input);
        System.out.println("*******************");
        input.nextLine();

        //18) Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user
        try {
            characterA(input);
        }catch (IllegalFormatCodePointException e){
            System.out.println(e.getMessage());
        }









    }//end main

    public static void opertaion(int num1,int num2)throws ArithmeticException {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        if (num2 == 0) throw new ArithmeticException("can't / by zero");
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void multiplication(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to prints its multiplication: ");
        try {
            int multiplication_num = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(multiplication_num + " x " + i + " = " + (i * multiplication_num));
            }
        }catch (InputMismatchException e){
            System.out.println("Enter integer number only");

        }
    }


    public static void calculateCircle(){
        Scanner input=new Scanner(System.in);
        try {
            System.out.print("Enter Radius: ");
            double radius = input.nextDouble();
            System.out.println("perimeter is: " + (2 * 3.14) * radius);
            System.out.println("Area is: " + (radius * radius) * (3.14));
        }catch (InputMismatchException e){
            System.out.println("sorry only number accepted");
        }
    }

    public static void calculateAverage(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of values:");
        try {
            int n = input.nextInt();
            double sum_of_integer = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter an integer ");
                sum_of_integer = sum_of_integer + input.nextInt();
            }
            System.out.println("The average is: " + (sum_of_integer / n));
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }}

    public static void checkSumEqualToThird(Scanner input) throws Exception {
        System.out.println("Q5) Please enter three integers:");
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        try {
            System.out.print("First integer: ");
            firstInteger = input.nextInt();

            System.out.print("Second integer: ");
            secondInteger = input.nextInt();

            System.out.print("Third integer: ");
            thirdInteger = input.nextInt();
        } catch (Exception e) {
            input.nextLine(); // Clear the invalid input
            throw new Exception("Invalid input. Please enter integers only.");
        }

        boolean isEqual = (firstInteger + secondInteger) == thirdInteger;
        System.out.println("The result is: " + isEqual);
    }

    public static void reverse(Scanner input)throws Exception{
        System.out.println("Q6) Write a Java program to reverse a word");
        System.out.println("please enter any string to create a Reverse:");
        System.out.print("Input a word: ");
        String normal_string= input.nextLine();

        if(normal_string.length()==1)throw new Exception ("String contain 1 char ");
        String reverse="";

        for (int i=normal_string.length()-1 ;i>=0;i--){
            reverse+=normal_string.charAt(i);
        }
        System.out.println("Reverse word: "+reverse);
    }

    public static void print(Scanner input){
        try {
            System.out.println("Q9)Enter an String:");
            String sentence = input.nextLine();
            System.out.print("Enter an integer number to check the index String:");
            int index = input.nextInt();

            if (index > sentence.length())
                System.out.println("character in the given index is: " + sentence.charAt(index - 1));
        }catch (NullPointerException e){
            System.out.println("the index grater than the length of the string");
        }
    }


    public static void rectangle(Scanner input){
        System.out.println("Q10)let's calculate area and perimeter of a rectangle:");
        try {
            System.out.print("Enter Width= ");
            double Width = input.nextDouble();
            System.out.print("Enter Height= ");
            double Height = input.nextDouble();
            if (Width == 0 || Height == 0) throw new IllegalArgumentException("The Height or Width is zero ");

            System.out.println("Area is " + Width + " * " + Height + " = " + (Width * Height));
            System.out.println("Perimeter is 2 * " + "(" + Width + " + " + Height + ") = " + 2 * (Width + Height));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void compare(Scanner input)throws InputMismatchException{
        System.out.println("Q11)Enter two number to compare theme");
        System.out.print("Enter First integer: ");
        int num1_compare=input.nextInt();
        System.out.print("Enter second integer: ");
        int num2_compare=input.nextInt();

        if(num1_compare==num2_compare)throw new InputMismatchException("it's equals");

        if(num1_compare!=num2_compare) {
            System.out.println(num1_compare + " != " + num2_compare);
        }else System.out.println(num1_compare + " == " + num2_compare);
        if(num1_compare<num2_compare)
            System.out.println( num1_compare+" < "+num2_compare);
        if(num1_compare>num2_compare)
            System.out.println( num1_compare+" > "+num2_compare);
        if(num1_compare>=num2_compare)
            System.out.println( num1_compare+" >= "+num2_compare);
        if(num1_compare<=num2_compare)
            System.out.println( num1_compare+" <= "+num2_compare);
    }


    public static void isEquals(Scanner input)throws Exception{
        System.out.println("Enter 4 integers from the user and prints equal or not");
        int count=0;
        //boolean out=false;
        int pre=0;
        while (count<4){
            System.out.println("Enter an integers number");
            if (count==0)
            {
                pre=input.nextInt();
            }else{
                if(pre!=input.nextInt())throw new Exception("Not Match");
                    //out=true;
                 count++;
        }
        System.out.println( "Numbers are  equal!");
    }}


    public static void checkNumbers (Scanner input)throws Exception{
        System.out.println("Q14)Enter integer number to check if whether it is negative, zero or positive");
        System.out.print("Enter integer: ");
        int check_number=input.nextInt();
        if(check_number==0){
            throw new Exception("The number is zero");
        }else if(check_number<0){
            throw new Exception("Number is negative");
        }else throw new Exception("Number is positive");
    }

    public static void reversedDigits(Scanner input){
        System.out.println("Q16)please enter an integer number to revers it");
        try {
            int num = input.nextInt();
            int reversed_dighits = 0;
            int d;
            if (num == 0) throw new InputMismatchException("can't handel zero");
            d = num % 10;
            reversed_dighits = reversed_dighits * 10 + d;
            num = num / 10;

            System.out.println("The reversed number is: " + reversed_dighits);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }


    public static void findLargestAndSmallest(Scanner input) {
        int enteredNum;
        Integer largest = null;
        Integer smallest = null;

        System.out.println("Enter numbers to find the largest and smallest, or enter 0 to quit.");

        while (true) {
            System.out.print("Enter a number: ");

            try {
                enteredNum = input.nextInt();

                if (enteredNum == 0) {
                    break; // Exit the loop on 0
                }

                // Initialize largest and smallest
                if (largest == null || smallest == null) {
                    largest = enteredNum;
                    smallest = enteredNum;
                } else {
                    if (enteredNum > largest) {
                        largest = enteredNum;
                    }
                    if (enteredNum < smallest) {
                        smallest = enteredNum;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
                input.next(); // Clear invalid input
            }
        }

        if (largest != null && smallest != null) {
            System.out.println("The largest number is: " + largest);
            System.out.println("The smallest number is: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }


    public static void characterA(Scanner input)throws IllegalArgumentException{
        System.out.println("Q18)please enter String to calculate number of character ‘a’");
        String sensent_a=input.nextLine();
       if(!Character.toString(sensent_a.charAt(0)).matches("[a-zA-Z]+"))throw new IllegalArgumentException("The string should start with char");
        int a_count=0;
        char character;
        for (int i = 0; i < sensent_a.length(); i++) {

            if(sensent_a.charAt(i) == 'a'){
                a_count++;
            }
        }
        System.out.println("Number of a's: "+a_count);
    }







}