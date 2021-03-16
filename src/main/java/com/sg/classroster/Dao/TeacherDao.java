package com.sg.classroster.Dao;

import com.sg.classroster.Entity.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacherById(int id);
}