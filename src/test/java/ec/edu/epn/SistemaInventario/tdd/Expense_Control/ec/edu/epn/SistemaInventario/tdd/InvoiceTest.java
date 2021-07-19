package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class InvoiceTest {
    private Invoice invoice;
    @Before
    public void setup(){
        invoice =new Invoice();
    }

    @Test
    public void given_one_doubles_when_calculateIva_then_ok(){
        assertEquals(40.8744,invoice.calculateIva(340.62),0);
    }

    @Test
    public void given_two_doubles_when_calculateTotal_then_ok(){
        assertEquals(381.4944,invoice.calculateTotal(340.62,40.8744),0);
    }

}




