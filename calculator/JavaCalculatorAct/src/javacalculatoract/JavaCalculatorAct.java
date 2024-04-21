package javacalculatoract;

import java.util.Scanner;

public class JavaCalculatorAct {

    public static void main(String[] args) {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            JavaCalculator calculator = new JavaCalculator();
            
            System.out.print("Enter first operand: ");
            double operand1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second operand: ");
            double operand2 = scanner.nextDouble();
            
            calculator.setOperand1(operand1);
            calculator.setOperator(operator);
            calculator.setOperand2(operand2);
           
            double result = calculator.calculate();
            
            System.out.println("Result: " + result);
   
        }
    }
}
