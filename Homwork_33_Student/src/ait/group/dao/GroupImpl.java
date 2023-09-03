package ait.group.dao;

import ait.group.GroupAppl;
import ait.group.model.Student;

import java.util.function.Predicate;

public class GroupImpl implements Group {
    Student[] students;
    int size;

    public GroupImpl(int capasity) {
        students = new Student[capasity];
    }

    @Override
    public boolean addStudent(Student student) {
        if (student == null || size == students.length || findStudentById(student.getId()) != null) {
            return false;
        }
        students[size] = student;
        size++;
        return true;
    }

    @Override
    public Student removeStudent(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                Student studentRemove = students[i];
                students[i] = students[size];
                students[size] = null;
                size--;
                return studentRemove;
            }
        }
        return null;
    }

    @Override
    public Student findStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    @Override
    public Student[] findStudentByName(String name) {
        Predicate<Student> predicate = student -> student.getName().equals(name);
        return findStudentsByPredicate(predicate);
    }

    @Override
    public Student[] findStudentsByGroup(int group) {
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (students[i].getGroup() == group) {
//                count++;
//            }
//        }
//        Student[] groupStudents = new Student[count];
//        for (int i = 0, j = 0; i < size; i++) {
//            if (students[i].getGroup() == group) {
//                groupStudents[j]= students[i];
//                j++;
//            }
//        }
        Predicate<Student> predicate = student -> student.getGroup() == group;
        return findStudentsByPredicate(predicate);
    }


    private Student[] findStudentsByPredicate(Predicate<Student> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(students[i])) {
                count++;
            }
        }
        Student[] arrStudentByPredicate = new Student[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (predicate.test(students[i])) {
                arrStudentByPredicate[j] = students[i];
                j++;
            }
        }
        return arrStudentByPredicate;
    }
}
