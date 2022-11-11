package pl.com.testowy.test.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity(name = "Book")
/* test*/
public class Book extends Publication {

    @Column
    private int pages;
}
