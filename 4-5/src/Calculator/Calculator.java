package Calculator;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Handler h1 = new AddHandler();
            Handler h2 = new SubtractHandler();
            Handler h3 = new MultiplyHandler();
            Handler h4 = new DivideHandler();

            h1.SetSuccessor(h2);
            h2.SetSuccessor(h3);
            h3.SetSuccessor(h4);

            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            String operator = sc.next();

            h1.HandleRequest(a, b, operator);
        }
    }



