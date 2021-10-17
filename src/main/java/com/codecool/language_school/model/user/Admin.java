package com.codecool.language_school.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import static com.codecool.language_school.model.user.Role.Values.ADMIN_STRING;
import static com.codecool.language_school.model.user.Role.Values.STUDENT_STRING;

@Entity
@DiscriminatorValue(value = ADMIN_STRING)
public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String name, String surname, int age, Credentials credentials) {
        super(name, surname, age, Role.ADMIN, credentials);
    }
}
