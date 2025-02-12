package ex_07_Switch_basics;

public class Lab_043_JDK13 {
    public static void main(String[] args) {
        int itemcodes =003;
        switch(itemcodes){
                case 001 -> System.out.println("001");
                case 002 -> System.out.println("002");
                case 003 -> System.out.println("003");
                default-> System.out.println("default");
        }
    }
}
