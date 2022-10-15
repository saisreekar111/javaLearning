public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("get the items");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("clean everything");
    }
}
