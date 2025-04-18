import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        //nextLine serve para pegar o valor inteiro da linha 
        String nome = scanner.nextLine();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        String numero  = scanner.next();

        System.out.println("Digite seu saldo :");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo é de "+saldo+", e ja esta disponivel para saque.");

        scanner.close();

    }
}
