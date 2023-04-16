package net.roszczyk.students;

import java.io.Serializable;

public class Student implements Serializable {
    String firstName;
    String lastName;
    String indexNumber;

    public Student() {}
    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getIndexNumber() {
        return indexNumber;
    }
    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString()
    {
        return this.firstName + " " + this.lastName + " " + this.indexNumber;
    }
}

