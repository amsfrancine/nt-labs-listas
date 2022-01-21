import java.util.Arrays;
import java.util.List;

public class Palindromo {
    public static void main(String[] args) {
        Palindromo frases = new Palindromo();
        frases.palindromo();

    }

    private List<String> palindromo() {
        List<String> texto = Arrays.asList("BATATA", "ANA", "TIJOLO", "RENNER", "REVIVER", "MARTELO", "A SACADA DA CASA","OVO");

        for (String palavra : texto) {
            String invertida = String.valueOf((new StringBuilder(palavra.replace(" ", "")).reverse()));
            if (invertida.equals(palavra.replace(" ", ""))) {
                System.out.println(palavra);
            }
        }
        return texto;
    }
}
