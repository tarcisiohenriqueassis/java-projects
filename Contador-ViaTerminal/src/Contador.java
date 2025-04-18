import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
     
        try{
     
       final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n Seja bem vindo ao contador (: \n ");
        
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        ParametroInvalidosExceptions(primeiroNumero,segundoNumero);

        ExecutaContador(primeiroNumero, segundoNumero);

        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Valor invalido, digite apenas numeros \n");
        }
    }
     static void ParametroInvalidosExceptions( int primeiroNumero, int segundoNumero){

        System.out.println(" ");

            if(primeiroNumero == segundoNumero){
                System.out.println("Valor invalidos numeros iguais! ");
            }
            else if (segundoNumero < primeiroNumero) {
                System.out.println("Sequencia invalida, o segundo numero não pode ser maior que o primeiro numero! ");
            }
    }
     static void ExecutaContador(int primeiroNumero, int segundoNumero){

        int valorInicial = primeiroNumero;
        int valorFinal = segundoNumero;

        for (int i = valorInicial ; i <= valorFinal; i++) {
            System.out.println(i);
        }
     } 

}
