package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;

public interface Ifile {
    public Invoice searchInvoiceFile(String idFactura);
    public String registerInvoiceFile(Invoice invoice);
}


