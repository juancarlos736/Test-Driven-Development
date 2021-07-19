package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;

public class Invoice {
    void showInvoice() {
        System.out.println(invoiceId+ provider + subtotal+ iva+ total + date);
    }


    public String invoiceId;
    public String provider;
    public double subtotal;
    public double iva;
    public double total;
    public String date;

    public Invoice(String invoiceId, String provider, double subtotal, String date) {
        this.invoiceId = invoiceId;
        this.provider = provider;
        this.subtotal=subtotal;
        this.iva= calculateIva(this.subtotal);
        this.total = calculateTotal(this.subtotal,this.iva);
        this.date=date;
    }

    public Invoice() {
    }

    public double calculateIva(double subtotal){
        return subtotal*(0.12);
    }

    public double calculateTotal(double subtotal, double iva){
       return subtotal+iva;
    }



    public String getInvoiceId() {
        return invoiceId;
    }



}
