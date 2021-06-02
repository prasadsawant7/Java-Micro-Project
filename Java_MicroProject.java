package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Students{
    String rollNo;
    String name;
    String className;
    private String mobileNo;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getSubject1Marks() {
        return subject1Marks;
    }

    public void setSubject1Marks(int subject1Marks) {
        this.subject1Marks = subject1Marks;
    }

    public int getSubject2Marks() {
        return subject2Marks;
    }

    public void setSubject2Marks(int subject2Marks) {
        this.subject2Marks = subject2Marks;
    }

    public int getSubject3Marks() {
        return subject3Marks;
    }

    public void setSubject3Marks(int subject3Marks) {
        this.subject3Marks = subject3Marks;
    }
}

/**
 * <b>Problem Statement</b><br>
 * Create a class student with the following member variable:<br>
 * <ul>
 * <li>Roll Number</li>
 * <li>Name</li>
 * <li>Class</li>
 * <li>Mobile Number</li>
 * <li>Subject 1 Marks</li>
 * <li>Subject 2 Marks</li>
 * <li>subject 3 Marks</li>
 * </ul>
 * Display the information of 10 students along with percentage and class based on percentage.
 * <br><br>
 * <b>Student</b> class has member as rollNo, name, className, mobileNo, subject1Marks, subject2Marks and subject3Marks.
 * There are getters and setters to set and get these members values.<br>
 * We have used File operations to set the data in the object. It's boring also to store multiple values we need to input
 * multiple values. Assume you have to put the values of 100 Students, its hectic. It is always better to have files to
 * store the data.
 *
 * @author Prasad Sawant, Siddhesh Kute, Sameer Dingore, Soham Gokhale
 * @since 02-06-2021
 * @version 0.1
 * @see <a href="https://github.com/SamDingore" target="_blank">Sameer's GitHub</a>
 * @see <a href="https://github.com/prasadsawant7" target="_blank">Prasad's GitHub</a>
 */
public class Java_MicroProject {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        Students[] students = new Students[10];
        for(int i=0; i<10; i++) {
            int n = 0;
            try {
                //Fetching values
                String rollNo = Files.readAllLines(Paths.get("RollNo.txt")).get(n);
                String name = Files.readAllLines(Paths.get("Name.txt")).get(n);
                String className = Files.readAllLines(Paths.get("Class.txt")).get(n);
                String mobileNo = Files.readAllLines(Paths.get("Mobile.txt")).get(n);
                String sub1 = Files.readAllLines(Paths.get("Subject1.txt")).get(n);
                String sub2 = Files.readAllLines(Paths.get("Subject2.txt")).get(n);
                String sub3 = Files.readAllLines(Paths.get("Subject3.txt")).get(n);

                System.out.println("Student " + (i+1));
                students[i] = new Students();
                //Setting values
                students[i].setRollNo(rollNo);
                students[i].setName(name);
                students[i].setClassName(className);
                students[i].setMobileNo(mobileNo);
                students[i].setSubject1Marks(Integer.parseInt(sub1));
                students[i].setSubject2Marks(Integer.parseInt(sub2));
                students[i].setSubject3Marks(Integer.parseInt(sub3));

                //Getting Values
                System.out.println(students[i].getRollNo());
                System.out.println(students[i].getName());
                System.out.println(students[i].getClassName());
                System.out.println(students[i].getMobileNo());
                System.out.println(students[i].getSubject1Marks());
                System.out.println(students[i].getSubject2Marks());
                System.out.println(students[i].getSubject3Marks() + "\n");
                n++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}