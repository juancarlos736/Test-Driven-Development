package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;
import org.junit.Before; import org.junit.Test; import org.junit.runner.RunWith; import org.junit.runners.Parameterized;
import java.util.ArrayList; import java.util.List; import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ValidatorParametersTest {
    private String invoiceID; private boolean expected; private Validator validator;
    @Before
    public void setup(){
        validator=new Validator();
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects=new ArrayList<Object[]>();
        objects.add(new Object[]{"123-978-958645837",true});
        objects.add(new Object[]{"998-978-958645837",true});
        objects.add(new Object[]{"001-978-958645837",true});
        objects.add(new Object[]{"002-978-958645837",true});
        objects.add(new Object[]{"003-978-958645837",true});
        objects.add(new Object[]{"0048-978-958645837",false});
        objects.add(new Object[]{"wer-978-958645837",false});
        objects.add(new Object[]{"003-9-9586458",false});
        return objects; }
    public ValidatorParametersTest(String invoiceID, boolean expected) {
        this.invoiceID = invoiceID;
        this.expected = expected; }

    @Test
    public void given_invoice_id_when_validation_then_ok(){
        assertEquals(validator.validateInvoiceId(invoiceID),expected);
    }
}

