package io.zipcoder.crudapp;

import javax.persistence.*;

@Table(name = "PERSON")
@Entity
public class Person {

    @Column(name = "FIRST_NAME")
    public String firstName;

    @Column(name = "LAST_NAME")
    public String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Integer id;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){};
}
