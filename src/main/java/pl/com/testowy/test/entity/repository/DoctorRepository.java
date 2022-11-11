package pl.com.testowy.test.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.testowy.test.entity.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
