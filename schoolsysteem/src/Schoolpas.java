public class Schoolpas {
    private static int volgendID = 1;

    private String ID;
    private String naam;
    private double saldo;
    private boolean geldig;
    private boolean heeftLiftToegang;
    private boolean isDocent;

    public Schoolpas(String naam, double saldo, boolean geldig, boolean heeftLiftToegang, boolean isDocent) {
        this.ID = "PAS-" + volgendID;
        volgendID++;
        this.naam = naam;
        this.saldo = saldo;
        this.geldig = geldig;
        this.heeftLiftToegang = heeftLiftToegang;
        this.isDocent = isDocent;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isDocent() {
        return isDocent;
    }

    public boolean isGeldig() {
        return geldig;
    }

    public boolean heeftLiftToegang() {
        return heeftLiftToegang;
    }
}