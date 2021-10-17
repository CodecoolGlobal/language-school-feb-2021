package com.codecool.language_school.model.attendance;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class AttendanceEntry {

    @Id
    @GeneratedValue
    private long id;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

    @ManyToOne
    private Attendance attendance;

    public AttendanceEntry(LocalDate date, AttendanceStatus status) {
        this.date = date;
        this.status = status;
    }

    public AttendanceEntry() {}

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setId(long attendanceEntryId) {
        this.id = attendanceEntryId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }
}
