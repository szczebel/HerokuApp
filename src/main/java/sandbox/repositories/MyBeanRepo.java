package sandbox.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sandbox.domain.MyBean;

@Repository
public interface MyBeanRepo extends CrudRepository<MyBean, Long>{
}
