public class Deurlezer {
    public void openDeur(Schoolpas pas) {
        if (!pas.isGeldig()) {
            System.out.println("pas is niet geldig.");
        } else if (!pas.isDocent()) {
            System.out.println("je hebt geen toegang.");
        } else {
            System.out.println("de deur gaat open.");
        }
    }

    public void openLift(Schoolpas pas) {
        if (!pas.isGeldig()) {
            System.out.println("pas is niet geldig.");
        } else if (!pas.heeftLiftToegang()) {
            System.out.println("je hebt geen toegang tot de lift.");
        } else {
            System.out.println("de lift gaat open.");
        }
    }
}
