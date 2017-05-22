package ro.sci.tema1;

import java.util.Scanner;

/**
 * Created by Florina Szasz on 5/4/2017.
 */
public class InputNbrs {
    public static int readNbrs(int i)
    {
        Scanner reader = new Scanner(System.in);
        if (i == 1) {
            System.out.println("Enter first number: ");
        }
        else {
            System.out.println("Enter second number: ");
        }
        int no = reader.nextInt();
        return (no);
    }
}
