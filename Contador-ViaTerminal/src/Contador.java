import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
     
        try{

        // executa o scanner
       final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n Seja bem vindo ao contador (: \n ");
        
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();//captura o valor digitado e pula para a proxima

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();
        
        //verifica se o primeiro numero é maior ou igual ao segundo numero
        ParametroInvalidosExceptions(primeiroNumero,segundoNumero);

        // executa a contagem dos numeros
        ExecutaContador(primeiroNumero, segundoNumero);

        //fecha o scanner 
        scanner.close();

        } //captura o erro se caso seja adicionado um valor String
        catch(InputMismatchException e){

            System.out.println("Valor invalido, digite apenas numeros \n");
        }
    }
     static void ParametroInvalidosExceptions( int primeiroNumero, int segundoNumero){

        System.out.println(" ");
            //impede de numero iguais no terminal
            if(primeiroNumero == segundoNumero){
                System.out.println("Valor invalidos numeros iguais! ");
            }//impede que o numero final seja menor que o valor inicial
            else if (segundoNumero < primeiroNumero) {
                System.out.println("Sequencia invalida, o segundo numero não pode ser maior que o primeiro numero! ");
            }
    }
     static void ExecutaContador(int primeiroNumero, int segundoNumero){

        int valorInicial = primeiroNumero;
        int valorFinal = segundoNumero;

        //a variavel i recebe o numero do valorInicial e vai sevir como parametro inicial do laço 

        for (int i = valorInicial ; i <= valorFinal; i++) {
            System.out.println(i);
        }
     } 

}
