package com.epam.hitch.model;

import javax.persistence.*;

/**
 * Created by Andrey on 09.11.2014.
 */
@Entity
@Table(name = "driver")
public class Driver {
    private long id;
    private String firstName;
    private String lastName;

    public Driver() {
    }

    public Driver(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
