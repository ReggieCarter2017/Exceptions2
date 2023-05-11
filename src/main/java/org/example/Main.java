package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionTest rr = new ExceptionTest();

        rr.isItEmpty();

    }
}

class ExceptionTest {
    public void isItEmpty()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your sentence that is not empty: ");
            String res = sc.nextLine();
            if (res.trim().isEmpty()) throw new RuntimeException();
            else { System.out.println("Your sentence is not empty!"); }
        } catch (RuntimeException e)
        {
            System.out.println("Your sentence is empty!");

        }
    }

}