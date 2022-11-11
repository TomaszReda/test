package pl.com.testowy.test.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue( "doctor")
/* test*/
public class Doctor extends Person {

    private static final long serialVersionUID = 8967877132564409367L;
    private String doctorCategory;

    public Doctor(String firstname, String lastname, String doctorCategory) {
        super(firstname, lastname);
        this.doctorCategory = doctorCategory;
    }
}
