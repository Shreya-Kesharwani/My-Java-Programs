package Generics;

import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;

class Student implements Comparable<Student> {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + marks + "-" + age + "-" + name;
    }

    public int compareTo(Student a) {
        if (this.age > a.getAge())
            return 1;
        else
            return -1;

    }
}

class Alpha implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.age > b.age)
            return 1;
        else
            return -1;

    }
}

public class Comparable_comparator {
    public static void main(String[] args) {
        Student st1 = new Student(45, 18, "Rohan");
        Student st2 = new Student(46, 17, "Rohit");
        Student st3 = new Student(44, 19, "Mehu");

        List<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);
        // Alpha a =new Alpha();

        Comparator<Student> com = (Student a, Student b) -> {
            if (a.age > b.age)
                return 1;
            else
                return -1;

        };
        // Collections.sort(list,a);
       // Collections.sort(list, com);
       Collections.sort(list);
        System.out.println(list);
    }

}
