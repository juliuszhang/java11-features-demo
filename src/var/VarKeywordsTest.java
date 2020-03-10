package var;

/**
 * @author yibozhang
 * @date 2020/3/10
 * 使用var 声明变量
 */
public class VarKeywordsTest {

    private int val;

    public static void main(String[] args) {
        var a = 1;
        var b = "A";
        var c = 1l;
        var d = 1f;
        var e = 1d;
        var f = 1;
        var g = 'c';
        var h = new VarKeywordsTest();
        var i = Integer.valueOf(1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h.val);
        System.out.println(h.getClass());
        System.out.println(i.getClass());

        //使用var声明变量的同时必须赋值
        //var l;
        //l = 1;
    }

}
