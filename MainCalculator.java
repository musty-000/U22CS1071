import java.util.Scanner;

class Maincalculator{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
       
      System.out.println("enter your first number: ");
      double num1 = scanner.nextDouble();

      System.out.println("enter your second number: ");
      double num2 = scanner.nextDouble();

      System.out.println("choose operation choice");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. division (/)");

      System.out.println("Enter your operation number");
      int operation = scanner.nextInt();

         double answer = 0;

      switch (operation) {
        case 1:
            answer = num1 + num2;
            break;
        case 2:
            answer = num1 - num2;
            break;
        case 3:
            answer = num1 * num2;
            break;

        case 4: 
           if (num2 != 0) {
            answer = num1 / num2;
           } else {
            System.out.println("error dividing by zero!");
           }
        default:
        System.out.println("select a valid operation number");
            System.exit(1);
      }
            

      System.out.println("Your Answer is " + answer);
      scanner.close();
    }
}