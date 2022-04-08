/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-04-04
* Title: Lab2 Q2
*/

public class DemoSubject {
    public static void main(String[] args) {

        // Instantiate subject 1 and assign value with mutator
        Subject subject1 = new Subject();
        subject1.setCode("KT14303");
        subject1.setName("Programming Pricinples");
        subject1.setGrade("A");

        // Instantiate subject2 with parameterised constructor
        Subject subject2 = new Subject("KT14203", "Object-oriented programming", "B");

        // Instantiate subject3 with parameterised constructor
        Subject subject3 = new Subject("KT24103", "Data Structures and Algorithms", "C");

        // Print out the detail of all subject
        subject1.print();
        subject2.print();
        subject3.print();
    }
}