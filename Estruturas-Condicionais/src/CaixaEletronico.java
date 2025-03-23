public class CaixaEletronico {
    
    public static void main(String[] args) {

    double saldo = 254.0;
    double valorSolicitado = 187.5;
    
    if(valorSolicitado > saldo){
        System.out.println(" Saldo insuficiente, saldo disponivel para saque: "+saldo);
    }
    else {  
        saldo = saldo - valorSolicitado;
        System.out.println("Valor retirado: "+valorSolicitado);
        System.out.println("Novo saldo: "+saldo);
    }
    
    

            
}

    
    
}
