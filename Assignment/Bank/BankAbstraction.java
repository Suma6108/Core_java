public class BankAbstraction {
    public static void main(String[] args) {
        centralBank cb = new centralBank("Roja",87955940, "Savings", "Hosur");
        cb.withdraw();
        cb.deposit();
        cb.getinterest();
    }
}
    

