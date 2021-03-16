package com.sg.classroster.Entity;

import java.util.List;

public class Course<Teacher, Student> {
    private int id;
    private String name;
    private String description;
    private Teacher teacher;
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Course course = (Course) object;
        return id == course.id && name.equals(course.name) && description.equals(course.description) && teacher.equals(course.teacher) && students.equals(course.students);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, name, description, teacher, students);
    }
}
