import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
   
        try{
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double alturaUsuario = scanner.nextDouble();

        System.out.println("Bem vindo "+nomeUsuario);
        System.out.println("Recebemos seu dados:");
        System.out.println("Nome: "+nomeUsuario);
        System.out.println("Sua idade: "+idadeUsuario);
        System.out.println("Sua altura: "+alturaUsuario);

        scanner.close();
    }
    catch(InputMismatchException e){
        
        System.out.println("Nos campos IDADE e ALTURA devem ser numericos");
    }
        
    }
}
