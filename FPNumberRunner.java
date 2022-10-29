import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        numbers.stream().forEach(element -> System.out.println("List: "+element));
        int sum = fpSum(numbers);
        //int sum = normalSum(numbers);
        System.out.println("Total Sum: "+sum);
        int sumOfOdd = numbers.stream()
                .filter(element -> element%2 != 0)
                .reduce(0,(number1,number2)
                -> number1+number2);
        System.out.println("Odd Sum: "+sumOfOdd);
    }

    private static int fpSum(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0,(number1, number2)
    -> number1+number2);
        return sum;
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        System.out.println(sum);
        return sum;
    }


}
