package pl.com.testowy.test.entity.model;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
 abstract class EntityId<ID extends Serializable> extends EntityLog implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public boolean isNew() {
        return id == null;
    }
}

