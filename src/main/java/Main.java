import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Calculator calculator = new Calculator();

      System.out.println("Enter a command: ");
      String command = "add 1 3";
      String[] parts = command.split(" ");

      if (command.equalsIgnoreCase("exit")) {
        System.out.println("Exiting program.");
      }

      switch (parts[0].toLowerCase()) {
        // add
        case "add":
          int addA=Integer.parseInt(parts[1]);
          int addB=Integer.parseInt(parts[2]);
          System.out.println("Result: " + calculator.add(addA, addB));
          break;

        // subtract
        case "subtract":
          int subA=Integer.parseInt(parts[1]);
          int subB=Integer.parseInt(parts[2]);
          System.out.println("Result: " + calculator.subtract(subA, subB));
          break;

        // multiply
        case "multiply":
          int mulA=Integer.parseInt(parts[1]);
          int mulB=Integer.parseInt(parts[2]);
          System.out.println("Result: " + calculator.multiply(mulA, mulB));
          break;

        // divide
        case "divide":
          int divA=Integer.parseInt(parts[1]);
          int divB=Integer.parseInt(parts[2]);
          System.out.println("Result: " + calculator.divide(divA, divB));
          break;

        // fibonacci
        case "fibonacci":
          int fibN=Integer.parseInt(parts[1]);
          System.out.println("Fibonacci " + fibN + ": " + calculator.fibonacciNumberFinder(fibN));
          break;

        // binary
        case "binary":
          int binN=Integer.parseInt(parts[1]);
          System.out.println("Binary of " + binN + ": " + calculator.intToBinaryNumber(binN));
          break;

    }
  }
}
