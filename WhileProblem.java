public class WhileProblem {
    public int limit;
    public WhileProblem(int limit) {
        this.limit = limit;
    }

    public static void main(String[] args) {
        WhileProblem number = new WhileProblem(10);
        number.printSquares();
        number.printCubes();
    }

    private void printCubes() {
        int j = 1;
        while(j<=limit){
            System.out.println(j*j*j);
            j++;
    }
    }

    private void printSquares() {
        int i = 1;
        while(i<=limit){
            System.out.println(i*i);
            i++;
        }


    }

    }

