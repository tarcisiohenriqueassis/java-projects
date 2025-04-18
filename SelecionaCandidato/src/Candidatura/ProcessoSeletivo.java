package Candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       imprimirSelecionados();
        /* 
        final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Processo seletivo: ");

        System.out.println("Digite o salario pretendido: ");
        Double salarioPretendido = scanner.nextDouble();
 
        analisarCandidato(salarioPretendido);

        scanner.close(); */
    }

    static boolean Atender(){

        return new Random().nextInt(6) == 3;
    }

    static void imprimirSelecionados(){
     
         String [] candidatos = {"Felipe","Pedro","Ronaldo","Alexandre","Leticia"};

         /*
         for (int i = 0; i < candidatos.length; i++) {
            System.out.println("o Cadidato de numero "+(i+1)+" é "+ candidatos[i]);
         }*/
 
         System.out.println(" ligando para os cadidatos ");

         for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Ligando para o candidato "+candidatos[i]);

             boolean ligando = Atender();

            if (!ligando) {
                System.out.println("ligando ...");
                
                for (int j = 0; j < 3; j++) {
                    System.out.println("chamando ...");
                }
                System.out.println("O candidato "+candidatos[i]+" não atendeu");
            }
            else{
            System.out.println("o candidato "+candidatos[i]+" atendeu !");
            }
         }
        
    }
    static void selecaoCandidatos(){

        String [] candidatos = {"Felipe","Pedro","Ronaldo","Alexandre","Leticia","Beatriz","Camila","Silvana","Carol","Josiane","Maria"};

        int candidatoSelecionados= 0;
        int candidatoAtual= 0;
        Double salarioBase = 2000.0; 
        Double valorPretendido = SalarioPretendido();

        while (candidatoSelecionados < 5 && candidatoAtual< candidatos.length) {

            String candidato = candidatos[candidatoAtual];

            candidatoAtual++;

            if (valorPretendido < salarioBase) {
                System.out.println("Cadidato "+ candidato +" foi selecionado com o valor de: "+valorPretendido);
                candidatoSelecionados++;
            }
            else{
                System.out.println("Desclassificados "+ candidato);
            }
        }
    }

    static Double SalarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        
    }
}
