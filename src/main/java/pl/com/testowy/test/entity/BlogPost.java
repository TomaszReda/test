package pl.com.testowy.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "BlogPOst")
public class BlogPost extends Publication {

    @Column
    private int pages;
}