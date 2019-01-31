import java.util.*;

public class Demoj8 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,68,7);
        Collections.sort(integerList, ( o1,  o2)-> o1-o2); //sorting in ascending order
        System.out.println(integerList);

        List<String> stringList = Arrays.asList("Raj","Ram");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(stringList);
    }
}
