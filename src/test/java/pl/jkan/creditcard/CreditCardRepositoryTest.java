package pl.jkan.creditcard;

import org.junit Assert;
import org.junit.Test;

class CreditCardRepositoryTest{
    private static final id = "new_id";
    
    @Test
    public void allowAddAndLoadCC(){
        CreditCard c =new CreditCard(id);
        
        CreditCardRepository repository = new CreditCardRepository();
        
        repository.add(c);
        
        CreditCard loaded = repository.find(id);
        Assert.assertEquals(loaded)
    }
}