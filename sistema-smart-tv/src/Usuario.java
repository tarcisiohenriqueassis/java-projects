public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("Status da Tv : "+smartTv.ligada);
       System.out.println("Canal Atual: "+smartTv.canal);
       System.out.println("Volume Atual: "+smartTv.volume);

       smartTv.ligar();
       System.out.println("TV Ligada: "+ smartTv.ligada);
       
       System.out.println("Canal Atual "+smartTv.canal);

       smartTv.diminuirCanal();
       smartTv.diminuirCanal();
       smartTv.diminuirCanal();
       System.out.println("Canal Atualizado"+smartTv.canal);

       smartTv.mudarCanal(15);

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
     
       System.out.println("Volume da tv: "+smartTv.volume);

       System.out.println("Canal Selecionado "+smartTv.canal);
    }
}
