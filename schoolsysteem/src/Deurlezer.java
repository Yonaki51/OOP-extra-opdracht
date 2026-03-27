public class Deurlezer {
    public void openDeur(Schoolpas pas) {
        if (!pas.isGeldig()) {
            System.out.println("pas is niet geldig.");
        }
        if (!pas.isDocent()) {
            System.out.println("je hebt geen toegang.");
        } else {
            System.out.println("de deur gaat open");
        }
    }
}
