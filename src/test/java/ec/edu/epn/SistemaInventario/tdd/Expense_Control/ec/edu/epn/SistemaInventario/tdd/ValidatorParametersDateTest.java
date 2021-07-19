package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;
import org.junit.Before; import org.junit.Test; import org.junit.runner.RunWith;
import org.junit.runners.Parameterized; import java.util.ArrayList; import java.util.List; import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ValidatorParametersDateTest {
    private String date; private boolean expected; private Validator validator;
    @Before
    public void setup(){
        validator=new Validator();
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects=new ArrayList<Object[]>();
        objects.add(new Object[]{"03/09/2021",true});
        objects.add(new Object[]{"30/09/2020",true});
        objects.add(new Object[]{"15/08/2020",true});
        objects.add(new Object[]{"17/07/2021",true});
        objects.add(new Object[]{"30/02/2021",false});
        objects.add(new Object[]{"31/04/2021",false});
        return objects;
    }
    public ValidatorParametersDateTest(String date,boolean expected) {
        this.date = date;
        this.expected = expected;
    }
    @Test
    public void given_invoice_date_when_validation_date_ok(){
        assertEquals(expected,validator.correctDate(date));
    }
}