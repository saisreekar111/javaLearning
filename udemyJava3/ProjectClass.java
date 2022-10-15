public class ProjectClass {

    /*
    interface Test { void nothing(); default void nothing1(){ } }
    class Class1 implements Test { public void nothing() { } }
    class Class2 implements Test { public void nothing() { } }
     */

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.ComplexAlgorithm(10,20));
    }
}
