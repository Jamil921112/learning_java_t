package ex_07_Switch_basics;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Lab_browseSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name ");
        String browserName = sc.nextLine();
        switch(browserName)



        {

            case "chrome":
                System.out.println("execute chrome");
                break;
                case "firefox":
                    System.out.println("execute firefox");
                    break;
                    case "ie":

                        System.out.println("execute ie");
                        break;

                        default:
                            System.out.println("Invalid browser");
                            break;


        }









    }
}
