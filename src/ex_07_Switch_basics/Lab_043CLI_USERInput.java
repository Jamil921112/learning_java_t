package ex_07_Switch_basics;

public class Lab_043CLI_USERInput {
    public static void main(String[] args) {


        /*  CLI Options
         Take a user input - Name, Age and Salary and print them in the end.
        Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        Scanner input = new Scanner(System.in);
          System.out.print("Enter name: ");
          int name  = input.nextInt();
          System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("enter your salary");
         double salary = input.nextDouble();
        */

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println("User information");
        System.out.println(" name:" + name);
        System.out.println("age:" + age);
        System.out.println("salary:" + salary);


    }
}

