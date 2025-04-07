import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a medida, para recorte: ");
        String  medida = scanner.next().toUpperCase();

        switch (medida) {
            case "P":
              System.out.println(" Medida selecionada: PEQUENO");
              break;

            case "M":
              System.out.println(" Medida selecionada: MEDIO");
              break;

            case "G":
              System.out.println(" Medida selecionada: GRANDE");
              break;

            default:
              System.out.println(" Medida invalida! Medidas disponiveis P,M,G");
              break;
        }
        //fecha o scanner, depois da execução para que n de erros
        scanner.close();

     }
}
