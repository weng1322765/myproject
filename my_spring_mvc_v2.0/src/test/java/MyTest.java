import com.alibaba.druid.support.logging.Log;
import com.service.StudentService;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WengLei on 2017/6/19.
 */
public class MyTest extends BaseTest{

    public void forFun(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getClassName());
    }

    @Autowired
    StudentService studentService;

    @Test
    public void testMain(){

        System.out.println("Hello World");
    }
}
