package ex_if_else_condition;

import java.util.Scanner;

public class lab036_if_elseif{
    public static void main(String[] args) {
        //num1>num2
        //num2>num1
        //num1=num2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = input.nextInt();
        System.out.println("enter the num2");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println("num1");
    } else if (num2 > num1) {            //else if can be many more
            System.out.println("num2");
        }
        else {                           // else only one time
        System.out.println("equal");

        }
        }
    }
