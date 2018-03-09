import bank.common.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        User user1 = new User(1);
        BankAccount bankAccount = bank.addAccount(user1);




    }

}
