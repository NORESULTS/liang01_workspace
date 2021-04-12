package dir1.dir2.service.impl;

import dir1.dir2.baseClass.Person;
import dir1.dir2.service.Service01;
import org.springframework.stereotype.Service;

/**
 * @author liangchao
 * @create 2021-04-12 16:50
 */
@Service("Service01")
public class Service01Impl implements Service01 {
//    @Autowired
//    private Person person;


    public Person getPerson() {
        Person p = new Person();
        p.setName("自动");
        p.setAge("0");
        return p;
    }
}
