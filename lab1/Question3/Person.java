/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-03-28
* Title: Lab1 Question3
*/

public class Person {
    private String name;
    private String phone;

    public Person(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public String printName() {
        return this.name;
    }

    public String printPhone(){
        return this.phone;
    }
}