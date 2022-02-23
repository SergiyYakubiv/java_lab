public class AppMain {
    public static void main(String[] args) {
        BankSecond bankSecond = new BankSecond();
        Bank bank = new Bank();
        Bank firstBank = new Bank("Kiev", 500, 1000);
        Bank secondBank = new Bank("OschadBank", 400, "Kiev", "Ukraine", 750);
        System.out.println(bank);
        System.out.println(firstBank);
        System.out.println(secondBank);
        System.out.println(bankSecond.toString());
    }
}
