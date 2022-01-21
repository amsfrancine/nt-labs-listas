import java.util.ArrayList;
import java.util.List;

public class Func {
    public static void main(String[] args) {
        Func.func().forEach(funcao->System.out.printf(" %.2f%n",funcao));
    }

    private static List<Double> func() {

        List<Double> listaFunc = new ArrayList<>();
        double x = 1;
        while (x < 500) {
            x = (x * 3 + 100)/2 ;
            listaFunc.add(x);
        }
        return listaFunc;
    }
}






