import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite a sequência de parênteses: ");
            String parenteses = in.next();
            parenteses = parenteses.replaceAll("\\s+", "");

            Validação validação = new Validação();
            if (validação.balanceamentoParenteses(parenteses) == false) {
                System.out.println("Balanceamente de parênteses inválido");
            } else {
                System.out.println("Balanceamente de parênteses válido!");
            }
        }
        while (true);
    }
}

