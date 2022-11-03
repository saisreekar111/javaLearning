import java.util.Scanner;

public class DoWhilePlayerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
            do {
                int cube = number * number * number;
                if(number != -1){
                    System.out.println("cube of number is: " + cube);
                }
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                //if(number<0){
                    //System.out.println("inValid");
               // }
                //number++;
            } while (number >= 0);
        System.out.println("You entered a negative number");
    }
}
