package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;

import java.util.ArrayList;

public class InvoiceList {
    public ArrayList<Invoice> invoices;

    /*public InvoiceList() {
        this.invoices = new ArrayList<>();
    }

    public String addInvoice(Invoice invoice){
        String aux="Factura registrada con exito";
        for(int i = 0; i<this.invoices.size(); i++){
            if(invoice.invoiceId.equals(this.invoices.get(i).invoiceId)){
                aux="Id de factura ya registrado";
            }
        }
        if(!aux.equals("Id de factura ya registrado")){
        this.invoices.add(invoice);
        }
        return aux;

    }*/

    public String addInvoice(Invoice invoice){
        for(int i = 0; i<this.invoices.size(); i++){
            if(invoice.invoiceId.equals(this.invoices.get(i).invoiceId)){
                return "Id de factura ya registrado";
            }
        }
            this.invoices.add(invoice);
        return "Factura registrada con exito";
    }



    /*public Invoice searchInvoice(String invoiceId){
       for(int i = 0; i<this.invoices.size(); i++){
           if(invoiceId.equals(this.invoices.get(i).invoiceId)){
               return this.invoices.get(i);

           }
        }
        return null;
    }*/

    public Invoice searchInvoice(String invoiceId){
        Invoice invoice = new Invoice();
        for(int i = 0; i<this.invoices.size(); i++){
            if(invoiceId.equals(this.invoices.get(i).invoiceId)){
                invoice =this.invoices.get(i);
            }
        }
        return invoice;
    }



    public void showInvoices(){
        System.out.println("invoiceId "+ "provider "+ "subtotal "+ "iva "+ "total "+ "date");
        for(int i=0; i<invoices.size(); i++){
            Invoice invoice=new Invoice();
            invoice=invoices.get(i);
            invoice.showInvoice();
        }
    }


}



