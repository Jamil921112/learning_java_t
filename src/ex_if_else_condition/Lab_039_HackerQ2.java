package ex_if_else_condition;

import java.util.Scanner;

public class Lab_039_HackerQ2 {
    public static void main(String[] args) {

        //✅ Triangle Classifier
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle.
// side 1, side 2, side3 ->eq , iso ,scalene

        //   logic building
        //   step 1 - find inp/output
        // input | side 1, side 2, side3 -> data types-> double
        // output | SOP -> string message -> equilateral, isosceles, scalene


            Scanner input = new Scanner(System.in);
            System.out.println("Enter a the side 1:  ");
            double side1 = input.nextDouble();

            System.out.println("Enter a the side 2:  ");
            double side2 = input.nextDouble();


            System.out.println("Enter a the side 3:  ");
            double side3 = input.nextDouble();

            //2. logic /rough logic
            // if side1==side2 and side2==side3 , side1==side3 -> equilateral triangle
            // else if side1==side2 || side2==side3|| side3== side1 -> isosceles
            // else > scalene

            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("The triangle is equilateral");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is  scalene");


            }


        }

    }
