package Bank;

public class Main {
    public static void main(String[] args) {
        Bank a = new Bank(1000,10);
        a.calculateInterest();
        System.out.println("interest is: " + a.calculateInterest());
    }
}
