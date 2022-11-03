public class MyNumber {
    private final int number;
    public MyNumber(int number) {
        this.number = number;
    }
    public boolean isPrime() {
        if(number < 2){
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumUpToN() {
        int sum = 0;
        for(int i=1; i<= number; i++){
            sum = sum+i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sumD = 0;
        for(int i=2; i<number; i++) {
        if(number%i==0) {
        sumD = sumD+i;
        }
        }
        return sumD;
    }
    public void printNumberTriangle() {
        //for(int i=1; i<=number-4; i++){
            //System.out.print(i+"");
       // }
        //for(int i=1; i<=number-3; i++){
            //System.out.print(i+"");
        //}
        //for(int i=1; i<=number-2; i++){
            //System.out.print(i+"");
        //}
       // for(int i=1; i<=number-1; i++){
            //System.out.print(i+"");
        //}
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
