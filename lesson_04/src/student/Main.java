package student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");

        System.out.println(student1);
        student1.addRate(5);
        student1.addRate(4);
        student1.addRate(3);
        System.out.println(student1);


        System.out.println("---------------- GROUP ----------------");
        Group group31_1 = new Group();
        group31_1.add(student1);
        group31_1.add(new Student("John"));

        System.out.println(group31_1);
    }
}