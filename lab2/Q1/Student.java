/*
* Name: Liew Shai Sam]
* Matrix Number: BI21110266
* Data:2022-04-04
* Title: La2 Q1
*/

public class Student {

    private String name; // Student name
    private String matricNo; // Student matric no
    private int age; // Student age
    private double cgpa; // Student CGPA

    // Default constructor assien empty variable
    public Student() {
        this.name = "";
        this.matricNo = "";
        this.age = 0;
        this.cgpa = 0;
    }

    // Parameterised constructor
    public Student(String name, String matricNo, int age, double cgpa) {
        this.name = name;
        this.matricNo = matricNo;
        this.age = age;
        this.cgpa = cgpa;

    }

    // Name mutator
    public void setName(String name) {
        this.name = name;
    }

    // Matric No mutator
    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    // Age mutator
    public void setAge(int age) {
        this.age = age;
    }

    // CGPA mutator
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Print function print out the detail of the object
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Matric No: " + this.matricNo);
        System.out.println("Age: " + this.age);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("");
    }
}