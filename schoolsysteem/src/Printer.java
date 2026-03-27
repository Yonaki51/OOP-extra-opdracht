public class Printer {
    private double printPrijs;
    private double kopieerPrijs;

    public Printer(double printPrijs, double kopieerPrijs){
        this.printPrijs = printPrijs;
        this.kopieerPrijs = kopieerPrijs;
    }

    public void printen(Schoolpas pas) {
        if (pas.isGeldig()) {
            if (!pas.isDocent()) {
                if (pas.getSaldo() < printPrijs) {
                    System.out.println("je hebt niet genoeg saldo.");

                }
                else{
                    pas.setSaldo(pas.getSaldo() - printPrijs);
                    System.out.println("je document wordt geprint.");
                }

            } else {
                System.out.println("je document wordt geprint.");
            }
        }
        else{
            System.out.println("je pas is niet geldig");
        }

    }

        public void kopieren(Schoolpas pas) {
        if (pas.isGeldig()) {
            if (!pas.isDocent()) {
                if (pas.getSaldo() < kopieerPrijs) {
                    System.out.println("je hebt niet genoeg saldo.");

                }
                else{
                    pas.setSaldo(pas.getSaldo() - kopieerPrijs);
                    System.out.println("je document wordt gekopieerd.");
                }

            } else {
                System.out.println("je document wordt gekopieerd.");
            }
        }
        else{
            System.out.println("je pas is niet geldig");
        }

    }


}
