public class BankSecond {
    private static String bank;
    private String bankAddress;
    private Integer bankClients;
    private Integer bankMoney;
    private String bankName;
    private String bankCountry;

    public BankSecond() {
    }

    public BankSecond(String bankAddress, Integer bankClients, Integer bankMoney, String bankName, String bankCountry) {
        this.bankAddress = bankAddress;
        this.bankClients = bankClients;
        this.bankMoney = bankMoney;
        this.bankName = bankName;
        this.bankCountry = bankCountry;
    }

    public BankSecond(String bankAddress, Integer bankClients, Integer bankMoney) {
        this.bankAddress = bankAddress;
        this.bankClients = bankClients;
        this.bankMoney = bankMoney;
    }
    public static String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "BankSecond{" +
                "bankAddress='" + bankAddress + '\'' +
                ", bankClients=" + bankClients +
                ", bankMoney=" + bankMoney +
                ", bankName='" + bankName + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                '}';
    }
}
