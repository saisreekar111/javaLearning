interface Flyable {
    void fly();
}
class Bird implements Flyable{

    public void fly() {
        System.out.println("with wings");
    }
}
class Aeroplane implements Flyable{

    public void fly() {
        System.out.println("with fuel");
    }
}
public class FlyableRunner{
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        //flyingObjects.fly();(as this is array u cant call an method directly)
        for(Flyable object: flyingObjects){
          object.fly();
        }
    }
}
