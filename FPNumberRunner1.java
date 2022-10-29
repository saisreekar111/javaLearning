import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner1 {
    public static void main(String[] args) {
        //List<Integer> numbers = List.of(4,6,8,13,3,15);
        IntStream.range(1,11).map(p->p*p)
                .forEach(p-> System.out.println(p));

        List.of("Apple","Ant","Bat").stream().map(s->s.toLowerCase())
                .forEach(s-> System.out.println(s));

        List.of("Apple","Ant","Bat").stream()
                .forEach(s-> System.out.println(s.length()));

    }
}
