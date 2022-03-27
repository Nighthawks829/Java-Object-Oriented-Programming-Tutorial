/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-03-28
* Title: Lab1 1.2
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
        System.out.print("Input Second number: ");
        int secondNum = input.nextInt();
        System.out.print("Input Third number: ");
        int thirdNum = input.nextInt();
        System.out.print("Input Fourth number: ");
        int fourthNum = input.nextInt();
        System.out.print("Input Fifth number: ");
        int fifthNum = input.nextInt();
        System.out.print("Average of the number: ");
        int average = (firstNum + secondNum + thirdNum + fourthNum + fifthNum) / 5;
        System.out.println(average);

        input.close();
    }
}