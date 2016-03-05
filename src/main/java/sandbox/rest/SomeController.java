package sandbox.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sandbox.domain.MyBean;
import sandbox.repositories.MyBeanRepo;

@RestController
public class SomeController {

    @Autowired MyBeanRepo myBeanRepo;

    @RequestMapping(value = "/magic")
    public Iterable<MyBean> m1() {
        myBeanRepo.save(new MyBean("sample", 987));
        return myBeanRepo.findAll();
    }

}
