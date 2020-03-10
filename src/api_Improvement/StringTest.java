package api_Improvement;

/**
 * @author yibozhang
 * @date 2020/3/10
 * String类增强
 */
public class StringTest {

    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
        System.out.println(s.repeat(3));
    }

}
