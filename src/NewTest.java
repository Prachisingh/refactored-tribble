import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by agangwar on 18/1/18.
 */
public class NewTest {
    public static void main(String args[]) {
        int n = 1;
        HashSet<String> alphaSet = new HashSet<String>();

        List<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("15");
        while (n <= 100) {
            Collections.shuffle(numbers, new Random());

           // alphaSet.add(numbers);
            System.out.println(numbers);
            //alphaSet.add(numbers)

            n++;
        }

        Iterator iter = alphaSet.iterator();
        while (iter.hasNext()) {
            //System.out.println(iter.next());
        }

    }
}
