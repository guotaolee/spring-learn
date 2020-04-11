package ioc.service.serviceImpl;

import ioc.dao.InjectionDao;
import ioc.service.InjectionService;

public class ConsInjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    //构造注入
    public ConsInjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }


    //模拟业务操作
    public void save(String arg) {
        System.out.println("service接受参数：" + arg);
        arg = arg + ":" + this.hashCode();

        injectionDao.save(arg);
    }
}
