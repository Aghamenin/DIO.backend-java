public class Usuario {
    
    public static void main(String[] args) {
        SmartTv SmartTv = new SmartTv();

        System.out.println("TV ligada? " + SmartTv.ligada);
        System.out.println("Canal Atual? " + SmartTv.canal);
        System.out.println("Volume atual? " + SmartTv.volume);

        System.out.println("---------------------");

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("------------------------");

        SmartTv.mudarCanal(13);

        System.out.println("Canal Atual? " + SmartTv.canal);

        System.out.println("----------------------------");

        SmartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + SmartTv.ligada);
    }
}
