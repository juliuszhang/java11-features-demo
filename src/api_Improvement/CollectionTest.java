package api_Improvement;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yibozhang
 * @date 2020/3/10
 * 集合增强
 */
public class CollectionTest {

    public static void main(String[] args) {
        var list = List.of("A", "B", "C", "D", "E");
        var listOfCopy = List.copyOf(list);
        System.out.println(listOfCopy);

        var set = Set.of("A", "B", "C", "D", "E");
        Set<String> setOfCopy = Set.copyOf(set);
        System.out.println(setOfCopy);

        Map<String, String> map = Map.of("A", "a", "B", "b", "C", "c");
        Map<String, String> mapOfCopy = Map.copyOf(map);
        System.out.println(mapOfCopy);
    }

}
