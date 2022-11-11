package pl.com.testowy.test.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue( "nurse")
@FilterDef(name = "INSURANCE_COMPANY_FILTER", parameters = {@ParamDef(name = "nurseCategory", type = "string")})
@Filter(name = "INSURANCE_COMPANY_FILTER", condition = " (nurseCategory is null or INSURANCE_COMPANY in (:insuranceCompanies)) ")
public class Nurse extends Person  {

    private static final long serialVersionUID = -3232087331207558935L;
    private String nurseCategory;

    @OneToMany
    private List<NurseAttribute> nurseAttributeList;

    public Nurse(String firstname, String lastname, String nurseCategory) {
        super(firstname, lastname);
        this.nurseCategory = nurseCategory;
    }
}
