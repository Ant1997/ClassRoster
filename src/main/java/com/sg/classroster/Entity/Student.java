package com.sg.classroster.Entity;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Student student = (Student) object;
        return id == student.id && java.util.Objects.equals(firstName, student.firstName) && java.util.Objects.equals(lastName, student.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, firstName, lastName);
    }
}