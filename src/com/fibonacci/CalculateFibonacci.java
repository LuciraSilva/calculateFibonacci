package com.fibonacci;

import java.util.Scanner;

public class CalculateFibonacci {
    public CalculateFibonacci(){

    }
    public int calcule (int numberA, int numberB, int numberAb, int fibonacci){
        for (int i = 0; i < fibonacci; i++){
            System.out.println(numberA);
            numberAb = numberA;
            numberA = numberA + numberB;
            numberB = numberAb;
        }
        return numberA;
    }
    public static void main(String[] args) {
        CalculateFibonacci myFibonacci = new CalculateFibonacci();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número o qual você deseja o fibonacci: ");
        int userInput = input.nextInt();
        System.out.println(myFibonacci.calcule(0, 1, 0, userInput));

    }
}
