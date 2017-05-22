package ro.sci.tema1;


import static ro.sci.tema1.InputNbrs.readNbrs;
import static ro.sci.tema1.OutputSum.printSum;
import static ro.sci.tema1.SumNbrs.makeSum;

/**The problem calculates the sum of all numbers between two
 * numbers read as input. If the two are equal it returns the
 * sum of the two numbers. If they are different it verifies
 * which is the smallest and begins calculating the sum from
 * that one until it reaches the biggest one, in a for loop.
 */

public class Main {

    public static void main(String[] args) {

        int i = 1;
        int no1 = readNbrs(i);
        i++;
        int no2 = readNbrs(i);
        int sum = makeSum(no1,no2);
        printSum(no1,no2,sum);
    }
}