import com.workshop.demo.WorkshopDemo;
import org.junit.Test;

import static org.junit.Assert.fail;


public class MyUnitTest {

    @Test
    public void test_method_1() {
        WorkshopDemo d = new WorkshopDemo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
        fail("failing test!!");
    }
}