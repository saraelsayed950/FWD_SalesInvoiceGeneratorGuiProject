
package project1_salesinvoices.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import project1_salesinvoices.Model.HeaderTableModel;
import project1_salesinvoices.Model.InvoiceHeader;
import project1_salesinvoices.Model.InvoiceLine;
import project1_salesinvoices.Model.LineTableModel;
import project1_salesinvoices.View.ProjectJframe;
import project1_salesinvoices.View.InvoiceHeaderDialog;
import project1_salesinvoices.View.InvoiceLineDialog;


public class SalesInvoiceListener implements ActionListener, ListSelectionListener{

    private ProjectJframe gen;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
   

    public SalesInvoiceListener(ProjectJframe gen) {
this.gen = gen;
    }

   

  
    
          
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("load")){
         System.out.println("load clicked");
         try { loadFile();}
         catch(Exception ex) { ex.printStackTrace();}
		 }
		 else if (e.getActionCommand().equals("save")){
	         //System.out.println("save clicked");
                 try { saveData();}
         catch(Exception ex) { ex.printStackTrace();}
                 
                 }
                 
                  else if (e.getActionCommand().equals("CreateNewInv")){
	         //System.out.println("Create New Invoice");
                 createInv(); }
                 
                  else if (e.getActionCommand().equals("DelInvoice")){
	         //System.out.println("Delete Invoice");
                  deleteInv();}
                 
                  else if (e.getActionCommand().equals("Add")){
	         //System.out.println("Add a new Item");
                  addItem();}
                 
                  else if (e.getActionCommand().equals("DelItem")){
	         //System.out.println("Delete Item");
                  deleteItem();}
                 
                  else if (e.getActionCommand().equals("createInvOk")){
	         //System.out.println("create new invoice");
                  createInvOk();}
                 
                 else if (e.getActionCommand().equals("createInvCancel")){
                    //System.out.println("cancel invoice");
	           createInvCancel();
                  }
                 else if (e.getActionCommand().equals("createLineOk")){
                      //System.out.println("add new item");
	           createLineOk();
                  }
                 
                 else if (e.getActionCommand().equals("createLineCancel")){
                     //System.out.println("canacel item");
	           createLineCancel();
                  }
                 

     } 
        /////////////////////////////////////////////////////////
	// load file feature
	   private void loadFile() throws Exception {
		 
		   JOptionPane.showMessageDialog(gen, "please select header file","invoice header",JOptionPane.WARNING_MESSAGE);
	       JFileChooser fc = new JFileChooser();
	       int result = fc.showOpenDialog(gen);
	       if (result == JFileChooser.APPROVE_OPTION) {
	    	   File selectFile = fc.getSelectedFile();
	    	   FileReader fr = new FileReader(selectFile);
	    	   BufferedReader br = new BufferedReader(fr);
	    	   String line = null ;
	    	   while ((line = br.readLine()) != null) {
	    		   String [] headerSegments = line.split(",");
	    		   String invIDStr = headerSegments[0];
	    		   String invDateStr = headerSegments[1];
	    		   String custName = headerSegments[2];
	    		   int invID = Integer.parseInt(invIDStr);
	    		   Date invDate = df.parse(invDateStr);
	    		   InvoiceHeader header = new InvoiceHeader(invID,invDate,custName);
	    		   gen.getInvoices().add(header);
	    	   }
	    	   br.close();
	    	   fr.close();
	    	   System.out.println("check");
	    
	    	   
	    	   JOptionPane.showMessageDialog(gen, "please select Invoice line file","invoice line",JOptionPane.WARNING_MESSAGE);
		       result = fc.showOpenDialog(gen);
		       if (result == JFileChooser.APPROVE_OPTION) {
		    	   selectFile = fc.getSelectedFile();
		    	   fr = new FileReader(selectFile);
		    	   br = new BufferedReader(fr);
		    	   line = null ;
		    	   while ((line = br.readLine()) != null) {
		    		   String [] lineSegments = line.split(",");
		    		   String invIDStr = lineSegments[0];
		    		   String invItem  = lineSegments[1];
		    		   String pricestr = lineSegments[2];
		    		   String countstr = lineSegments[3];
		    		   int invID = Integer.parseInt(invIDStr);
		    		   double price = Double.parseDouble(pricestr);
		    		   int count = Integer.parseInt(countstr);
		    		   InvoiceHeader header = findByNum(invID);
		    		   InvoiceLine invline = new InvoiceLine (invItem,price,count,header);
		    		   header.addLine(invline);
		    	   }
		    	   br.close();
		    	   fr.close();
		    	//   System.out.println("check 2");
            gen.setHeaderTableModel(new HeaderTableModel(gen.getInvoices()));
            gen.getjTable_InvoiceTable().setModel(gen.getHeaderTableModel());
	     gen.getjTable_InvoiceTable().validate();
            

	    		   
	    	   }
	      
	       }
	   }
	   //function to attach headerTable by lineTable with given "invoiceID"
	   private InvoiceHeader findByNum (int num) {
		   for(InvoiceHeader header : gen.getInvoices() ) {
			   if(header.getInvoiceID() == num ) {
				   return header;
			   }
		   }
		   return null ;
		} 

  /////////////////////////////////////////////////////////////////////////
     // function for selection
   @Override
    public void valueChanged(ListSelectionEvent e) {
        HeaderTableRowSelected();
        
    }
    // 
    private void HeaderTableRowSelected() {
        
        int selectedRowIndex = gen.getjTable_InvoiceTable().getSelectedRow();
        if(selectedRowIndex>=0){
        InvoiceHeader row = gen.getHeaderTableModel().getInvoices().get(selectedRowIndex);
       
        gen.getjLabel_CustomerName().setText(row.getInvoiceCustomerName());
    
     gen.getjTextField_InvoiceDate().setText(row.getInvoiceDate().toString());
       gen.getjLabel_InvoiceNumberDisplay().setText(""+row.getInvoiceID());
      gen.getjLabel_InvoiceTotalDisplay().setText(""+row.getInvoiceTotal());
    ArrayList<InvoiceLine> lines= row.getLines();
    gen.setLineTableModel(new LineTableModel(lines));
    
     gen.getjTable_InvoiceItems().setModel( gen.getLineTableModel());
    gen.getLineTableModel().fireTableDataChanged();
    }
    }
  //////////////////////////////////////////////////////////
    // save file feature
    private void saveData() throws Exception{
        
        //for Header Tabel
        JOptionPane.showMessageDialog(gen, "Please Choose File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showOpenDialog(gen);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter out = new PrintWriter(Csvfile);
 
           for (InvoiceHeader header : gen.getInvoices()) {
             
               out.printf("%d ,%s,%s",header.getInvoiceID(),header.getInvoiceDate().toString(),header.getInvoiceCustomerName());
               out.println();
            }
           out.close();
            JOptionPane.showMessageDialog(gen, "Successfully Header Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        //for Lines Tabel
               JOptionPane.showMessageDialog(gen, "Please Chosce File Line to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
          fileChoosers = new JFileChooser();
         option = fileChoosers.showOpenDialog(gen);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter outt = new PrintWriter(Csvfilee);
 
 
           for (InvoiceHeader header : gen.getInvoices()) {
               for(InvoiceLine Lines :header.getLines()){
               outt.printf("%s ,%s,%d",Lines.getItemName(),""+Lines.getItemPrice(),Lines.getItemCount());
               outt.println();
            }}
           outt.close();
            JOptionPane.showMessageDialog(gen, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
 
    }
    //////////////////////////////////////////////////////////////
   // create new invoice feature
    private void createInv() {
        gen.setHeaderDialog(new InvoiceHeaderDialog(gen));
        gen.getHeaderDialog().setVisible(true);
       
    }

    private void createInvOk() {
        String customerName=  gen.getHeaderDialog().getCustomerNameField().getText();
        String invDateStr =  gen.getHeaderDialog().getDateField().getText();
       Date invDate =new Date();
        try{
            invDate = df.parse(invDateStr);
            
         }catch(ParseException ex){
           
         }
        
        gen.getHeaderDialog().setVisible(false);
        int num= getMaxInvNum() +1;
        InvoiceHeader newInvoiceHeader = new InvoiceHeader(num,invDate,customerName);
        gen.getInvoices().add(newInvoiceHeader);
        gen.getHeaderTableModel().fireTableDataChanged(); 
        
    }
     private void deleteInv() {
        int row = gen.getjTable_InvoiceTable().getSelectedRow();
        gen.getHeaderTableModel().removeRow(row);
         gen.getHeaderTableModel().fireTableDataChanged();
         gen.getHeaderTableModel().fireTableDataChanged();
   
    }
    private void createInvCancel() {
        gen.getHeaderDialog().setVisible(false);
    }

    private int getMaxInvNum()
    {
      int num = 0;
      for(InvoiceHeader headr:  gen.getInvoices())
      {
         if(headr.getInvoiceID() > num)
         {
           num= headr.getInvoiceID();
         }
      }
      return num;
    }
    
    /////////////////////////////////////////////////////////
    
           // add item feature
    
      private void addItem() {
          gen.setLineDialog(new InvoiceLineDialog(gen));
          gen.getLineDialog().setVisible(true);
    }
      
    private void createLineOk() {
       String itemName= gen.getLineDialog().getItemNameField().getText();
        String itemCountStr= gen.getLineDialog().getItemCountField().getText();
         String itemPriceStr= gen.getLineDialog().getItemPriceField().getText();
         gen.getLineDialog().setVisible(false);
         
         int itemCount =Integer.parseInt(itemCountStr);
         double itemPrice=Double.parseDouble(itemPriceStr);
        
         InvoiceHeader invoiceHeader= gen.getInvoices().get(gen.getjTable_InvoiceTable().getSelectedRow());
         InvoiceLine line= new InvoiceLine(itemName,itemPrice,itemCount,invoiceHeader);
         invoiceHeader.addLine(line);
         gen.getLineTableModel().fireTableDataChanged();
         gen.getHeaderTableModel().fireTableDataChanged();
    }
    
    
    private void deleteItem() {
        int row = gen.getjTable_InvoiceItems().getSelectedRow();
         gen.getLineTableModel().removeRow(row);
         gen.getLineTableModel().fireTableDataChanged();
         gen.getHeaderTableModel().fireTableDataChanged();
    }
    private void createLineCancel() {
        gen.getLineDialog().setVisible(false);
        }

    }
   

