/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-04-04
* Title: lAB2 
*/

public class DemoStudent {
    public static void main(String[] args) {
        // Instantiate student 1 and assign value with mutator
        Student student1 = new Student();
        student1.setName("Abidin");
        student1.setMatricNo("47899");
        student1.setAge(20);
        student1.setCgpa(3.05);

        // Instantiate student 2 with parameterised constructor
        Student student2 = new Student("Mark Jone", "39119", 19, 2.97);

        // Instantiate student 3 with parameterised constructor
        Student student3 = new Student("Joy Rogers", "81774", 21, 3.38);

        // Print out the detail of all student
        student1.print();
        student2.print();
        student3.print();
    }
}