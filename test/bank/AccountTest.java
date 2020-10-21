package bank;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    public AccountTest() {
    }

    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = new Account("chinmayee");
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetBalance2() {
        System.out.println("getBalance2");
        Account instance = new Account("chinmayee");
        instance.deposit(343444);
        int expResult = 343444;
        int result = instance.getBalance();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int amount = 50000;
        Account instance = new Account("chinmayee");
        instance.deposit(amount);
        int expResult = amount;
        int result = instance.getBalance();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        int amount1 = 3000;
        Account instance = new Account("chinmayee");
        instance.deposit(amount1);
        int amount2= 1000; 
      instance.deposit(5000);
      instance.withdraw(amount1);
      int expResult=amount2-amount1;
      int result=instance.getBalance();
      assertEquals(expResult,result,0.0);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of transferTo method, of class Account.
     */
    @Test

    public void testTransferTo() {
        System.out.println("transferTo");
        int amount = 4000;
        Account other = new Account("arti");
        Account instance = new Account("chinmayee");
         instance.deposit(5000);
        instance.transferTo(amount, other);
         assertEquals(other.getBalance(), amount);
         assertEquals(instance.getBalance(),1000 );
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getOwner method, of class Account. ////
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Account instance = new Account("chinmayee");
        String expResult = "chinmayee";
        String result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
