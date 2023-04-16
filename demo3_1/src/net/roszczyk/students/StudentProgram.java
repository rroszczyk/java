package net.roszczyk.students;

import java.io.*;

public class StudentProgram {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
//        Student student = new Student(
//                "Jan",
//                "Kowalski",
//                "307312");
//
//        System.out.println(student);
//
//        FileOutputStream fos = new FileOutputStream("student.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(student);
        FileInputStream fis = new FileInputStream("student.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student)ois.readObject();

        System.out.println(student);
    }
}
