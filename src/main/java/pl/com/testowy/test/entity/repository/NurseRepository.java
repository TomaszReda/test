package pl.com.testowy.test.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.com.testowy.test.entity.model.Nurse;

import java.util.List;

@Repository
public interface NurseRepository  extends JpaRepository<Nurse,Long> , QuerydslPredicateExecutor<Nurse> {


    @Query("Select nur from Nurse nur " +
            "left join nur.nurseAttributeList nal " +
            "where nur.nurseCategory= :nurseCAtegory")
    List<Nurse> list(@Param("nurseCAtegory") String nurseCAtegory);
}
