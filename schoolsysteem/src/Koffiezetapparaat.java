public class Koffiezetapparaat {
    private double koffiePrijs;

    public Koffiezetapparaat(double koffiePrijs) {
        this.koffiePrijs = koffiePrijs;
    }

    public void koffieZetten(Schoolpas pas) {
        if (pas.isGeldig()) {
            if (!pas.isDocent()) {
                if (pas.getSaldo() < koffiePrijs) {
                    System.out.println("je hebt niet genoeg saldo.");

                }
                else{
                    pas.setSaldo(pas.getSaldo() - koffiePrijs);
                    System.out.println("je koffie wordt gezet.");
                }

            } else {
                System.out.println("je koffie wordt gezet");
            }
        }
        else{
            System.out.println("je pas is niet geldig");
        }

    }
}
