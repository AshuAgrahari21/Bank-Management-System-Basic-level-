
import java.util.List;
import java.util.ArrayList;
import java.util.*;





public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        Customer customer1 = new Customer("John Doe", "1234");
        Account account1 = new Account("1234567890", customer1);
        bank.addAccount(account1);

        customer1.changePin("1234", "5678");

        account1.deposit(1000.0);
        System.out.println("Account balance: " + account1.getBalance());

        account1.withdraw(500.0);
        System.out.println("Account balance: " + account1.getBalance());

        Customer customer2 = new Customer("Jane Doe", "9012");
        Account account2 = new Account("9876543210", customer2);
        bank.addAccount(account2);

        account1.transfer(account2, 200.0);
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
