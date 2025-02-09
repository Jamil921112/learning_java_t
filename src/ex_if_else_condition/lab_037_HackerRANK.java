package ex_if_else_condition;

import java.util.Scanner;

public class lab_037_HackerRANK {
    public static void main(String[] args) {


        // the first principle of testing
        // DDA don't assume anything
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        // logic build
        // inputs/ output
        // input score ->(0-100)/ data type int
        // output/ grade /data type-> char

        //  step2  basic logic
        // if(score >= 90 && score <=100 ->return opr print grade A
        // else if score >= 89 && score <=90  ->return print grade B
        //else if( score <=79  && score >=70 ->return print grade C
        //else if( score <=69  && score >=60 ->return print grade D
        //else if( score <=59 && score >=0 ->return print grade F OR
        //else print grade F
        // Write the code


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score ");
        int score = sc.nextInt();
           char grade = 'N';
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
                grade = 'B';
            } else if (score >=70 && score <= 79) {
                grade = 'C';
            } else if (score >= 60 && score <= 69) {
                grade = 'D';
            }          else {
                            grade = 'F';
                        }
                        System.out.println("Your grade: " + grade);

        }
                }


