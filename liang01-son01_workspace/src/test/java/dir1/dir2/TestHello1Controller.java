package dir1.dir2;

import dir1.dir2.controller.Hello1Controller;
import org.junit.Test;

/**
 * @author liangchao
 * @create 2021-04-13 12:37
 */

public class TestHello1Controller {
    @Test
    public void testS1(){
        Hello1Controller a = new Hello1Controller();
        System.out.println(a.s1());;

    }

    @Test
    public void testS2(){
        Hello1Controller a = new Hello1Controller();
        System.out.println(a.s2());;

    }
}
