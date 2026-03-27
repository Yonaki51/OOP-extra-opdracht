public class App {
    public void saldoOpwaarderen(Schoolpas pas, double aantal) {
        pas.setSaldo(pas.getSaldo()+ aantal);
        System.out.println("je nieuwe saldo is nu " + pas.getSaldo());
    }
}
