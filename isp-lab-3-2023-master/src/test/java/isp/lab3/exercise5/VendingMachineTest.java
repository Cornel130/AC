package isp.lab3.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void testSelectProduct()
    {VendingMachine ved=new VendingMachine(5);
    ved.AddProduse(0,"Cola",2);
        assertEquals("Credit insuficient",ved.selectProd(0));
       ved.insertCoin(1);
       assertEquals("Credit insuficient",ved.selectProd(0));
       assertEquals("ID invalid",ved.selectProd(5));


    }
}
