public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv (false, 1, 25);

        System.out.println("Está ligada? " + smartTv.getLigada());
        if (smartTv.getLigada() == true) {
            System.out.println("Canal: " + smartTv.getCanal());
            System.out.println("Volume: " + smartTv.getVolume());
            System.out.println();    
        }

        smartTv.ligarTv();
        System.out.println("Está ligada? " + smartTv.getLigada());
        if (smartTv.getLigada() == true) {
            System.out.println("Canal: " + smartTv.getCanal());
            System.out.println("Volume: " + smartTv.getVolume());
            System.out.println();    
        }

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.getVolume());
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.getVolume());
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.getVolume());
        System.out.println();

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.getCanal());
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.getCanal());
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.getCanal());
        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.getCanal());
        System.out.println();
        
    }
}
