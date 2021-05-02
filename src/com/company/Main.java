package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double STEPS_IN_FLORE =2;

        double n,a,b;
        double nn,aa,bb;
        double result;
        double resultt;

        Scanner input = new Scanner(System.in);
        System.out.println("Введи цифорки");
        System.out.println("N ");
        n=input.nextDouble();

        System.out.print("A ");
        a= input.nextDouble();

        System.out.print("B ");
        b = input.nextDouble();

        System.out.println("Введи цифорки с другой стороны");
        System.out.println("Nn ");
        nn=input.nextDouble();

        System.out.print("Aa ");
        aa= input.nextDouble();

        System.out.print("Bb ");
        bb = input.nextDouble();

        result = n*a*b  * STEPS_IN_FLORE ;
        resultt = nn*aa*bb  * STEPS_IN_FLORE ;

        System.out.println("ваша жизнь увеличиться на " + result + "секунд");
        System.out.println("ваша жизнь увеличиться на " + resultt + "секунд");
    }
}
