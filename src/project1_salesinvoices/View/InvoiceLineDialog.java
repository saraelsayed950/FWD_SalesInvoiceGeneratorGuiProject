
package project1_salesinvoices.View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvoiceLineDialog extends JDialog{
    private JTextField itemNameField;
    private JTextField itemCountField;
     private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
     private JLabel itemPriceLabel;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public InvoiceLineDialog(ProjectJframe gen) {
        itemNameLabel = new JLabel("Item Name:");
        itemNameField = new JTextField(20);
        
        
        itemCountLabel =new JLabel("Item Count");
        itemCountField =new JTextField(20);
        
        itemPriceLabel =new JLabel("Item Price:");
        itemPriceField =new JTextField(20);
        
        okBtn = new JButton("Ok");
        okBtn.addActionListener(gen.getListener());
        okBtn.setActionCommand("createLineOk");
        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(gen.getListener());
        cancelBtn.setActionCommand("createLineCancel");
        
        setLayout(new GridLayout(4,2));
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);
        //setSize(300,120);
       // setLocation(200,200);
       
       pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

   public JTextField getItemCountField() {
        return itemCountField;
    }
   
   public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
    
}
