package com.codecool.language_school.model.user;

import com.codecool.language_school.model.attendance.Attendance;
import com.codecool.language_school.model.klass.Klass;
import com.sun.istack.NotNull;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

import static com.codecool.language_school.model.user.Role.Values.STUDENT_STRING;

@Entity
@DiscriminatorValue(value = STUDENT_STRING)
public class Student extends User {

    @ManyToOne
    private Klass klass;

    @OneToOne(mappedBy = "student")
    private Attendance attendance;

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, String surname, int age, Credentials credentials, Klass klass) {
        super(name, surname, age, Role.STUDENT, credentials);
        this.klass = klass;
    }

    public Student() {}

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
