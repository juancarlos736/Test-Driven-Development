package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonthlyBudgetTest {
    MonthlyBudget budget;
    @Before
    public void setup(){
        budget =new MonthlyBudget("04/08/2021",987.67);
    }
    @Test
    public void given_two_doubles_when_descreaseBudget_then_ok(){
        Invoice invoice =new Invoice("123-345-345654564","tia",70,"08/10/2021");
        assertEquals(909.27,budget.decreaseBudget(invoice),0);

    }

}


