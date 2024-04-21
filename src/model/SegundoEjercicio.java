package model;

import java.util.Scanner;

public class SegundoEjercicio {
    Scanner scanner;
    public SegundoEjercicio(){
        this.scanner = new Scanner(System.in);
    }
    public void showBiggerNumber() {
        int inputOne;
        int inputTwo;

        System.out.println("Ingresa el primer número");
         inputOne = scanner.nextInt();

        System.out.println("Ingresa el primer número");
        inputTwo = scanner.nextInt();

        if (inputOne>inputTwo){
            System.out.println("El número mayor es: "  + inputOne);
        } else if (inputOne == inputTwo) {
            System.out.println("Los números son iguales");
        }else
            System.out.println("El número mayor es: " + inputTwo);
    }

    public static void main(String[] args) {
        SegundoEjercicio second = new SegundoEjercicio();
        second.showBiggerNumber();
    }
}
