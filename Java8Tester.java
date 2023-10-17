import java.util.ArrayList;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {
        List <String> li = new ArrayList<>();
        li.add("Pravesh");
        li.add("Kartik");
        li.add("Pawan");
        li.add("\uD83D");
        li.forEach(System.out::println);
    }
}
