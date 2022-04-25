
package project1_salesinvoices.Model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

public class LineTableModel extends DefaultTableModel {
      private String [] colsNames = {"item Name", "item Price" , "item Count","Items Total"};
      private ArrayList<InvoiceLine> lines;
      
      public LineTableModel(ArrayList<InvoiceLine> lines) {
             this.lines = lines;
             
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
        if(this.lines == null){
            lines = new ArrayList<>();
        }
    	return lines.size();
    }
      
      @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine row = lines.get(rowIndex);
        switch(columnIndex)
        {
            case 0:return row.getItemName();
            case 1:return row.getItemPrice();
            case 2:return row.getItemCount();
            case 3:return row.getItemTotal();
        }
    	return "" ;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }
     @Override
    public void removeRow(int row) {
             lines.remove(row);

    }
    
}
