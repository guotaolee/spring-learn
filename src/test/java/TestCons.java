import ioc.UnitTestBase;
import ioc.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestCons extends UnitTestBase{

    public TestCons() {
        super("classpath:spring-cons-ioc.xml");
    }

    @Test
    public void testCons() {
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }
}
