/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-04-04
* Title: Lab2 Q2
*/

public class Subject {

    // Subject Code
    private String code;
    // Subject Name
    private String name;
    // Subject Grade
    private String grade;

    // Default constructor assien empty string
    public Subject() {
        this.code = "";
        this.name = "";
        this.grade = "";
    }

    // Parameterised constructor
    public Subject(String code, String name, String grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

    // Code mutator
    public void setCode(String code) {
        this.code = code;
    }

    // Name mutator
    public void setName(String name) {
        this.name = name;
    }

    // Grade mutator
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Name accessor
    public String getName() {
        return this.name;
    }

    // Code accessor
    public String getCode() {
        return this.code;
    }

    // Grade accessor
    public String getGrade() {
        return this.grade;
    }

    // Print function print out the detail of the object
    public void print() {
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println("");
    }
}