package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;

public class MonthlyBudget {
    public String month;
    public double budgetInventary;

    public MonthlyBudget(String month, double budget) {
        this.month = month;
        this.budgetInventary =budget;
    }

    public  double decreaseBudget(Invoice invoice){
        this.budgetInventary =this.budgetInventary - invoice.total;
        return this.budgetInventary;
    }

}

