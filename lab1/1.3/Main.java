/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-03-28
* Title: Lab1 1.3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstNum=input.nextInt();
        System.out.print("Input second integer: ");
        int secondNum=input.nextInt();

        if(firstNum!=secondNum){
            System.out.println(firstNum+" != "+secondNum);
        }
        if(firstNum==secondNum){
            System.out.println(firstNum+" == "+secondNum);
        }
        if(firstNum>secondNum){
            System.out.println(firstNum+" > "+secondNum);
        }
        if(firstNum>=secondNum){
            System.out.println(firstNum+" >= "+secondNum);
        }
        if(firstNum<secondNum){
            System.out.println(firstNum+" < "+secondNum);
        }
        if(firstNum<=secondNum){
            System.out.println(firstNum+" <= "+secondNum);
        }
        input.close();
    }
}