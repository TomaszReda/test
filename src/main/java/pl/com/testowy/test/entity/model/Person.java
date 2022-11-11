package pl.com.testowy.test.entity.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.com.testowy.test.entity.model.EntityBase;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorColumn(name = "person_category")

public abstract class Person extends EntityBase {


    private static final long serialVersionUID = -9161053913562083765L;
    private String firstname;
    private String lastname;
}
