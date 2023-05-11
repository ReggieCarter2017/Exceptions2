import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        
        Exceptions ex = new Exceptions();
        ex.firstException(); // Первое задание


        CodeReview cr = new CodeReview();
        cr.firstCode(); // Второе задание
    }
}

class Exceptions {

    public void firstException()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float number: ");
        String test = sc.nextLine();
        try {
            Float res = Float.parseFloat(test);
            System.out.println(res);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number formation!");
            firstException();
        }
    }
}

class CodeReview {
    public void firstCode()
    {
        Double[] intArray = {1.4, 2.12, 3.1, 4.9, 54.3, 32.2, 53.1, 54.2, 7.3};
        try {
            int d = 0;
            if (d == 0) throw new ArithmeticException("Can't divide by zero!");
            else {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

    }
}
