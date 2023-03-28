import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void BankAccountValue(){
        BankAccount account = new BankAccount("Theo","Lloyd", "06.08.99");
        account.setBalance(100);
        account.deposit(50);
        assertEquals(150,account.getBalance());
    }
}
