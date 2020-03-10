package api_Improvement;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yibozhang
 * @date 2020/3/10
 * Stream增强
 */
public class StreamTest {

    public static void main(String[] args) {
        var list = List.of("B", "B", "C", "B", "D", "D", "E", "F", "F", "G", "D");
        //从集合中删除元素直到不满足条件为止
        System.out.println(list.stream().dropWhile(item -> item.equals("B")).collect(Collectors.toList()));
        System.out.println(list.stream().takeWhile(item -> item.equals("B")).collect(Collectors.toList()));

    }

}
