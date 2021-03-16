package com.sg.classroster.Entity;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Teacher teacher = (Teacher) object;
        return id == teacher.id && java.util.Objects.equals(firstName, teacher.firstName) && java.util.Objects.equals(lastName, teacher.lastName) && java.util.Objects.equals(specialty, teacher.specialty);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, firstName, lastName, specialty);
    }
};