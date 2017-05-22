package ro.sci.tema1;

/**
 * Created by Florina Szasz on 5/3/2017.
 */
public class SumNbrs {
    public static int makeSum(int min, int max){
        int sum;
        if(min == max) {
            sum = min + max;
            return sum;
        }
        else if(min > max){
            int aux = min;
            min = max;
            max = aux;
        }
        sum = min;
        for (int i = min + 1; i <= max; i++){
            sum += i;
        }
        return sum;
    }
}
