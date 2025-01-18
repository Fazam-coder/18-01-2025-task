package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSource {
    public static double input() throws NumberEq0Exception,
            InputMismatchException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();

        if ((int)f == 0) {
            throw new NumberEq0Exception();
        }
        return f;
    }
}

