package ec.edu.epn.SistemaInventario.tdd.Expense_Control.ec.edu.epn.SistemaInventario.tdd;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {

    /*public boolean validateInvoiceId(String invoiceId){
        Pattern pa= Pattern.compile("[0-9]{3}[-][0-9]{3}[-][0-9]{9}");
        Matcher mat = pa.matcher(invoiceId);
        return mat.matches();
    */
    public boolean validateInvoiceId(String invoiceId){
        boolean exit;
        Pattern pa= Pattern.compile("[0-9]{3}[-][0-9]{3}[-][0-9]{9}");
        Matcher mat = pa.matcher(invoiceId);
        if(mat.matches()==true){
            exit=true;
        }
        else{
            exit=false;
        }
        return  exit;
    }

    private int[] extractDate(String date) {
        String[] separatedData = date.split("/");
        int[] data=new int[3];
        data[0] = Integer.parseInt(separatedData[0]);
        data[1] = Integer.parseInt(separatedData[1]);
        data[2] = Integer.parseInt(separatedData[2]);
        return data;
    }
    private boolean leapyear(String fecha1) {
        int year= extractDate(fecha1)[2];
        boolean isLeap;
        isLeap=((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
        return isLeap;
    }

    public boolean correctDate(String date1) {
        int year= extractDate(date1)[2];
        int day= extractDate(date1)[0];
        int month= extractDate(date1)[1];
        int validDate=0;
        if (year >= 2020) {
            validDate ++;
        }
        if (month >= 1 && month <= 12) { validDate ++; }
        switch (month) {
            case 2:
                if ( leapyear(date1)) {
                    if (day >= 1 && day <= 29) { validDate ++; }
                } else {
                    if (day >= 1 && day <= 28) { validDate ++; }
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day >= 1 && day <= 30) { validDate ++; }
                break;
            default:
                if (day >= 1 && day <= 31) { validDate ++; }
        }
        if (validDate==3) { return true;}
        return false;
    }
}
