public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv está Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv está Ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Tv está Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Tv está Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(54);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
