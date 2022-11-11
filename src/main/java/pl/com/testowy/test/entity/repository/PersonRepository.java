package pl.com.testowy.test.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.testowy.test.entity.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
