/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-03-28
* Title: Lab1 Question3
*/

public class Person {
    
    private String name;    // Person name
    private String phone;   // Person phone

    // Constructor 
    public Person(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    // Return person name
    public String printName() {
        return this.name;
    }

    // Return person phone
    public String printPhone(){
        return this.phone;
    }
}