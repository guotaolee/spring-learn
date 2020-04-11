package ioc.service.serviceImpl;

import ioc.dao.InjectionDao;
import ioc.service.InjectionService;

public class SetterInjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    //设值注入（设值注入也就是调用set方法,如果没有这步骤的话，该业务实现在运行时将报空指针异常，因为加载不到injectionDao）
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    //模拟业务操作
    public void save(String arg) {
        System.out.println("service接受参数：" + arg);
        arg = arg + ":" + this.hashCode();

        injectionDao.save(arg);
    }
}
