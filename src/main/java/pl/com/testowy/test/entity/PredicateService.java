package pl.com.testowy.test.entity;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.stereotype.Service;
import pl.com.testowy.test.entity.model.QNurse;

@Service
public class PredicateService {

    private static final QNurse q=QNurse.nurse;

    public Predicate get() {
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        booleanBuilder.and(q.firstname.eq("123123"));

        return booleanBuilder;
    }
}
