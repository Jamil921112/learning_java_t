package ex_07_Switch_basics;

public class lab_042JDK13_Concept {
    public static void main(String[] args) {

        int itemcode =006;  // jdk> 13


        switch (itemcode) {
            case 001, 002, 003 :
                System.out.println("This item is electronic");
                break;
                case 005, 006,007 :
                    System.out.println("This item is powerelectronics appliances");
                    break;

        }


    }
}
