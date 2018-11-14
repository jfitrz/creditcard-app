package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test

public class CreditCardApiTest {
    private static final double initialCredit=200;
    private static final String id = "123456789";
    private CreditCardRepository repository ;
    private CreditCardApi api;
    
    @Test
    public void withdrawFromCard(){
        thereIsCreditCardApi();
        thereIsCardWithId(id);
        
        api.withdraw(id, 20);
        
        balanceOfcardWithIdEquals(id, 150);
    }
    
    private void thereIsCardWithId(String id) {
        CreditCard c = new CreditCard(id);
        c.assignLimit(double.valueOf(initialCredit);
        
        repository.add(c)
    }
    
    private void thereIsCardApi() {
        this.api = new CreditCardApi();
    }
    
    private void thereIsCreditCardRepository() {
        this.repository = new CreditCardRepository();
    }
    
    private void balanceOfcardWithIdEquals(String id,)
        CreditCard c - repository.find(id)
        
        Assert.assertEquals{
            double.valueOf(money);
            c.getBalance()
        }
    
}