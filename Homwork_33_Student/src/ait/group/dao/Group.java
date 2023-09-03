package ait.group.dao;

import ait.group.model.Student;

public interface Group {
    boolean addStudent(Student student);
    Student removeStudent(int id);
    Student findStudentById(int id);
    Student[] findStudentByName(String name);
    Student[] findStudentsByGroup(int group);
}
