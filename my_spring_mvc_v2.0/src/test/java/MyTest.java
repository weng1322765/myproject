import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;

/**
 * Created by WengLei on 2017/6/19.
 */
public class MyTest extends TestCase{

    public void forFun(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getClassName());
    }

    @Test
    public void testMain(){

    }
}
