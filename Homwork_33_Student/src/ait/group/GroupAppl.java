package ait.group;

import ait.group.dao.Group;
import ait.group.dao.GroupImpl;
import ait.group.model.Student;

import java.util.Arrays;

public class GroupAppl {
    public static void main(String[] args) {

        GroupImpl group = new GroupImpl(25);

        Student[] arrStudent = new Student[10];
        arrStudent[0] = new Student(1, "Kolya", 100);
        arrStudent[1] = new Student(2, "Anna", 100);
        arrStudent[2] = new Student(3, "Yurii", 200);
        arrStudent[3] = new Student(4, "Vanya", 400);
        arrStudent[4] = new Student(5, "Ivan", 100);
        arrStudent[5] = new Student(6, "Masha", 100);
        arrStudent[6] = new Student(7, "Ira", 400);
        arrStudent[7] = new Student(8, "Maksim", 200);
        arrStudent[8] = new Student(9, "Kolya", 200);
        arrStudent[9] = new Student(10, "Kosta", 600);

        for (int i = 0; i < arrStudent.length; i++) {
            group.addStudent(arrStudent[i]);
        }
        Student[] res = group.findStudentsByGroup(100);
        printStudent(res);
        System.out.println("==============sort===========");
        Arrays.sort(res,Student.byName);
        printStudent(res);

    }

    public static void printStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
