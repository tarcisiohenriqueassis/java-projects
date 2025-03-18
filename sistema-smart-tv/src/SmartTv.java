public class SmartTv {
    
    boolean ligada = false;
    int canal = 13;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume da Tv para "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume da Tv para "+volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal "+canal);
    }
    public void mudarCanal(int novoCanal){
        canal =  novoCanal;
    }

}

