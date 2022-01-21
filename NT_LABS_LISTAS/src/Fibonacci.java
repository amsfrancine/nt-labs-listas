import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci.fibonacci().forEach(System.out::println);
    }

    private static List<Integer> fibonacci() {
        List<Integer> listaFibonacci = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c;
        while (a < 300) {
            c = a;
            a = a + b;
            b = c;
            listaFibonacci.add(a);
        }

     return listaFibonacci;
    }
}