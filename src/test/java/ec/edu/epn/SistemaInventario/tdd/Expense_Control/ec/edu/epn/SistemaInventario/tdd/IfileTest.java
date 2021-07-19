package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class IfileTest {
    private Invoice invoice1, invoice2;
    private Ifile ifile;
    @Before
    public void setup(){
        ArrayList<Invoice> facturasguardadas=new ArrayList<>();
        invoice1 =new Invoice("848-345-423434532","supermaxi",45.56,"10/10/2020");
        invoice2 =new Invoice("123-345-345654564","tia",70,"08/10/2021");
        facturasguardadas.add(invoice1);
        facturasguardadas.add(invoice2);
        ifile = Mockito.mock(Ifile.class);
    }
    @Test
    public void given_invoice_when_search_in_File_then_ok() {
    Mockito.when(ifile.searchInvoiceFile("123-345-345654564")).thenReturn(invoice2);
    assertEquals(invoice2, ifile.searchInvoiceFile("123-345-345654564"));
    }
    @Test
    public void given_invoice_when_register_in_File_then_ok() {
        Mockito.when(ifile.registerInvoiceFile(invoice1)).thenReturn("registro exitoso");
        assertEquals("registro exitoso", ifile.registerInvoiceFile(invoice1));
    }
}

