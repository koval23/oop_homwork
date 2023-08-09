package lesson_02;

public class Main {
    public static void main(String[] args) {
        // #1 Создать класс Student со следующими полями (
// String firstName,
// String lastName,
// MyDate birthday,
// String group,
// MyDate startCourse}
//Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
// который возвращает строку с данными студента.

        System.out.println("Hello OOP");

        MyDate birthday = new MyDate();
        birthday.month = 23;
        birthday.day = 3;
        birthday.year = 1992;

        MyDate startCourse = new MyDate();
        startCourse.year = 2023;
        startCourse.day = 18;
        startCourse.month = 7;


        Student koval = new Student();
        koval.firstName = "Yurii";
        koval.lastName = "Koval";
        koval.group = "31_1";
        koval.birthday = birthday;
        koval.startCourse = startCourse;
        studentToString(koval);

    }
//-------------Method------------------

    public static void studentToString(Student student) {
        System.out.println("First Name: "+student.firstName);
        System.out.println("Last Name: "+student.lastName);
        System.out.println("Number group: "+student.group);
        System.out.println("Birthday student: "+student.birthday.year+" "+student.birthday.month+" "+student.birthday.day);
        System.out.println("Start course: "+student.startCourse.year+" "+student.startCourse.month+" "+student.startCourse.day);
    }
//-------------End Method------------------

}
