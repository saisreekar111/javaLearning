import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2:");
        int number2 = scanner.nextInt();
        System.out.println("number1 you entered is:"+number1);
        System.out.println("number1 you entered is:"+number2);
        System.out.println("Choices Available:");
        System.out.println("1-Add");
        int sum = number1+number2;
        System.out.println("2-Subtract");
        int subtract = number1-number2;
        System.out.println("3-Multiply");
        int multiply = number1*number2;
        System.out.println("4-Divide");
        float divide = number1/number2;
        System.out.println("Enter choice:");
        int choice = scanner.nextInt();
        //performOperationUsingNestedIfElse(number1, number2, sum, subtract, multiply, divide, choice);
        performOperationUsingSwitch(number1, number2, sum, subtract, multiply, divide, choice);

    }

    //private static void performOperationUsingNestedIfElse(int number1, int number2, int sum, int subtract, int multiply, float divide, int choice) {
        //if(choice == 1) {
            //System.out.println("The sum of " + number1 + " and " + number2 + " is:" + sum);
       // } else if (choice == 2) {
            //System.out.println("The Subtraction of " + number1 + " and " + number2 + " is:" + subtract);
        //} else if (choice == 3) {
           // System.out.println("The Multiplication of " + number1 + " and " + number2 + " is:" + multiply);
        //}else if(choice == 4) {
           // System.out.println("The Division of " + number1 + " and " + number2 + " is:" + divide);
        //}else{
           // System.out.println("Please enter valid choice:");
      //  }
   // }
    private static void performOperationUsingSwitch(int number1, int number2, int sum, int subtract, int multiply, float divide, int choice) {
        switch (choice){
            case 1: System.out.println("The sum of " + number1 + " and " + number2 + " is:" + sum);
            break;
            case 2: System.out.println("The Subtraction of " + number1 + " and " + number2 + " is:" + subtract);
            break;
            case 3: System.out.println("The Multiplication of " + number1 + " and " + number2 + " is:" + multiply);
            break;
            case 4: System.out.println("The Division of " + number1 + " and " + number2 + " is:" + divide);
            break;
            default: System.out.println("default");
            break;
        }
    }
}

