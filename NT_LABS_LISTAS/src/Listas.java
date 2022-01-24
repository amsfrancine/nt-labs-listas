import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    protected static List<Integer> fibonacci() {
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
        listaFibonacci = listaFibonacci.stream().filter(entry -> entry % 2 == 0).toList();
        return listaFibonacci;
    }

    protected static List<Double> func() {
        List<Double> listaFunc = new ArrayList<>();
        double x = 1;
        while (x < 500) {
            x = (x * 3 + 100) / 2;
            listaFunc.add(x);
        }
        return listaFunc;
    }

    protected static List<String> palindromo() {
        List<String> texto = Arrays.asList("BATATA", "ANA", "TIJOLO", "RENNER", "REVIVER", "MARTELO", "A SACADA DA CASA", "OVO");
        String invertida;
        StringBuilder builder;
        for (String palavra : texto) {
            builder = new StringBuilder(palavra.replace(" ", "")).reverse();
            invertida = builder.toString();
            if (invertida.equals(palavra.replace(" ", ""))) {
                System.out.println(palavra);
            }
        }
        return texto;
    }

    protected static List<Integer> primos() {
        List<Integer> listaPrimos = new ArrayList<>();
        int numero, divisores;
        for (int cont = 1; cont <= 500; cont++) {
            numero = 0;
            divisores = 0;
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


