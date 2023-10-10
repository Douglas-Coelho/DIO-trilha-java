public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv SmartTv = new SmartTv();

        /*System.out.println("A TV está ligada? " + SmartTv.ligada);
        System.out.println("Canal atual: " + SmartTv.canal);
        System.out.println("Volume atual: " + SmartTv.volume);*/
    
        SmartTv.ligar();
        System.out.println("Novo status --> A TV está ligada? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("A TV ainda está ligada? " + SmartTv.ligada);

        SmartTv.aumentarVolume();
        
        SmartTv.aumentarVolume();
        
        SmartTv.aumentarVolume();
        
        SmartTv.diminuirVolume();
        
        SmartTv.aumentarCanal();
        System.out.println("Canal atual: " + SmartTv.canal);
        
        SmartTv.aumentarCanal();
        System.out.println("Canal atual: " + SmartTv.canal);
        
        SmartTv.aumentarCanal();
        System.out.println("Canal atual: " + SmartTv.canal);
        
        SmartTv.diminuirCanal();
        System.out.println("Canal atual: " + SmartTv.canal);
        
        SmartTv.diminuirCanal();
        System.out.println("Canal atual: " + SmartTv.canal);
        
        SmartTv.mudarCanal(27);
        System.out.println("Canal atual: " + SmartTv.canal);
    }
}
