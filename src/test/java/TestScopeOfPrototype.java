import ioc.UnitTestBase;
import ioc.bean.BeanScope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestScopeOfPrototype extends UnitTestBase {

    public TestScopeOfPrototype() {
        super("classpath:spring-bean-scope-prototype.xml");
    }

    @Test
    public void TestScopeOfPrototype() {
        BeanScope beanScope1 = super.getBean("beanScope");
        System.out.println(beanScope1.hashCode());

        BeanScope beanScope2 = super.getBean("beanScope");
        System.out.println(beanScope2.hashCode());
    }
}
