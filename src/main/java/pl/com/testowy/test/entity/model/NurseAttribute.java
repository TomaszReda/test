package pl.com.testowy.test.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
/* test*/
public class NurseAttribute extends EntityBase{
    private String atributeValue;
}
