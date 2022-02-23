public record Bank(String bankName, Integer bankClients,
                   String bankAddress, String bankCountry,
                   Integer bankMoney) {

    public static String bank;

    public Bank() {
        this("MonoBank", 250, "Kiev", "Ukraine", 500);
    }

    public Bank(String bankAddress, Integer bankClients, Integer bankMoney) {
        this("defaultName", bankClients, bankAddress, "defaultCountry", bankMoney);
    }

    public static String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankClients=" + bankClients +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                ", bankMoney=" + bankMoney +
                '}';
    }
}
