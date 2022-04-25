
package project1_salesinvoices.Model;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;



public class HeaderTableModel extends DefaultTableModel {
      private String [] colsNames = {"invoiceID","invoiceDate","CustomerName","Total"};
      private ArrayList<InvoiceHeader> invoices;
      
      public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
             this.invoices = invoices;
             this.colsNames = colsNames;
      }
      
      @Override
    public int getColumnCount() {
    	// TODO Auto-generated method stub
    	return colsNames.length;
    }
      
      @Override
    public String getColumnName(int column) {
    	// TODO Auto-generated method stub
    	return colsNames[column];
    }
 
      @Override
    public int getRowCount() {
    	// TODO Auto-generated method stub
        if(this.invoices == null){
            invoices = new ArrayList<>();
        }
    	return invoices.size();
    }
      
      @Override
    public Object getValueAt(int row, int column) {
    	InvoiceHeader inv = invoices.get(row);
    	switch (column) {
    	case 0: return inv.getInvoiceID();
    	case 1: return inv.getInvoiceDate();
    	case 2: return inv.getInvoiceCustomerName();
        case 3: return inv.getInvoiceTotal();

    	}
    	return null ;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }
    
     @Override
    public void removeRow(int row) {
          invoices.remove(row);
    }
}
