public class Main {
    public static void main(String[] args) {
        Schoolpas leerling = new Schoolpas("Jan", 5, true, true, false);
        Schoolpas docent = new Schoolpas("Peter", 0, true, true, true);
        Deurlezer deurlezer = new Deurlezer();
        Koffiezetapparaat koffie = new Koffiezetapparaat(1);
        Printer printer = new Printer(0.60, 0.60);
        App app = new App();
        
        deurlezer.openDeur(leerling);
        deurlezer.openDeur(docent);
        koffie.koffieZetten(docent);

    }
}
