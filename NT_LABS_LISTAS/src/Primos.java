import java.util.ArrayList;
import java.util.List;

public class Primos {
    public static void main(String[] args) {

        Primos primos = new Primos();
        primos.primos().forEach(System.out::println);
    }

    private List<Integer> primos() {
        List<Integer> listaPrimos = new ArrayList<>();

        for (int cont = 1; cont <= 500; cont++) {

            int numero = 0;
            int divisores = 0;

            for (int num = 1; num <= cont; num++) {
                if (cont % num == 0) {
                    divisores++;
                    numero = num;
                }
            }
            if (divisores == 2) {
                listaPrimos.add(numero);
            }
        }
        return listaPrimos;
    }
}
