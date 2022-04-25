
package project1_salesinvoices.View;

import project1_salesinvoices.Model.HeaderTableModel;
import project1_salesinvoices.Model.LineTableModel;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import project1_salesinvoices.Controller.SalesInvoiceListener;
import project1_salesinvoices.Model.InvoiceHeader;


public class ProjectJframe extends javax.swing.JFrame {
    public ProjectJframe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InvoiceTable = new javax.swing.JLabel();
        jPanel_OfInvoiceTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_InvoiceTable = new javax.swing.JTable();
        jTable_InvoiceTable.getSelectionModel().addListSelectionListener(listener);
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_InvoiceItems = new javax.swing.JTable();
        jLabel_InvoiceNumberDisplay = new javax.swing.JLabel();
        jLabel_InvoiceDate = new javax.swing.JLabel();
        jLabel_CustomerName = new javax.swing.JLabel();
        jLabel_InvoiceTotalDisplay = new javax.swing.JLabel();
        InvoiceItemsTable = new javax.swing.JLabel();
        jTextField_InvoiceDate = new javax.swing.JTextField();
        jTextField_CustomerName = new javax.swing.JTextField();
        jLabel_InvoiceNumber = new javax.swing.JLabel();
        jLabelInviceTotal = new javax.swing.JLabel();
        CreateNewInvoice = new javax.swing.JButton();
        CreateNewInvoice.addActionListener(listener);
        CreateNewInvoice.setActionCommand("CreateNewInv");
        DeleteInvoice = new javax.swing.JButton();
        DeleteInvoice.addActionListener(listener);
        DeleteInvoice.setActionCommand("DelInvoice");
        AddItem = new javax.swing.JButton();
        AddItem.addActionListener(listener);
        AddItem.setActionCommand("Add");
        DeleteItem = new javax.swing.JButton();
        DeleteItem.addActionListener(listener);
        DeleteItem.setActionCommand("DelItem");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        LoadFile.addActionListener(listener);
        LoadFile.setActionCommand("load");
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(listener);
        SaveFile.setActionCommand("save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoiceTable.setText("InvoiceTable");

        jTable_InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jTable_InvoiceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable_InvoiceTable);

        jTable_InvoiceItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jTable_InvoiceItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jTable_InvoiceItems);

        jLabel_InvoiceNumberDisplay.setText("InvNum");

        jLabel_InvoiceDate.setText("Invoice Date");

        jLabel_CustomerName.setText("Customer Name");

        jLabel_InvoiceTotalDisplay.setText("InvTotal");

        InvoiceItemsTable.setText("Invoice Items");

        jTextField_CustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CustomerNameActionPerformed(evt);
            }
        });

        jLabel_InvoiceNumber.setText("Invoice Number");

        jLabelInviceTotal.setText("Invoice Total");

        CreateNewInvoice.setText("Create New Invoice");
        CreateNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewInvoiceActionPerformed(evt);
            }
        });

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceActionPerformed(evt);
            }
        });

        AddItem.setText("Add Item");
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });

        DeleteItem.setText("Del Item");
        DeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_OfInvoiceTableLayout = new javax.swing.GroupLayout(jPanel_OfInvoiceTable);
        jPanel_OfInvoiceTable.setLayout(jPanel_OfInvoiceTableLayout);
        jPanel_OfInvoiceTableLayout.setHorizontalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CreateNewInvoice)
                        .addGap(74, 74, 74)
                        .addComponent(DeleteInvoice))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_InvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_CustomerName)
                                            .addComponent(jLabel_InvoiceDate)
                                            .addComponent(jLabelInviceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_InvoiceTotalDisplay)
                                                    .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_InvoiceNumberDisplay)
                                                    .addComponent(jTextField_InvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(96, 96, 96))
                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceItemsTable)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddItem)
                        .addGap(76, 76, 76)
                        .addComponent(DeleteItem)
                        .addGap(113, 113, 113))))
        );
        jPanel_OfInvoiceTableLayout.setVerticalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_InvoiceNumber)
                            .addComponent(jLabel_InvoiceNumberDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_InvoiceDate)
                            .addComponent(jTextField_InvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_CustomerName)
                            .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_InvoiceTotalDisplay)
                            .addComponent(jLabelInviceTotal))
                        .addGap(18, 18, 18)
                        .addComponent(InvoiceItemsTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddItem)
                            .addComponent(DeleteItem))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteInvoice)
                            .addComponent(CreateNewInvoice))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("File");

        LoadFile.setText("Load File");
        jMenu1.add(LoadFile);

        SaveFile.setText("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvoiceTable)
                    .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvoiceTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewInvoiceActionPerformed

    private void DeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceActionPerformed

    private void jTextField_CustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CustomerNameActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileActionPerformed

    private void AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddItemActionPerformed

    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItem;
    private javax.swing.JButton CreateNewInvoice;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JButton DeleteItem;
    private javax.swing.JLabel InvoiceItemsTable;
    private javax.swing.JLabel InvoiceTable;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JLabel jLabelInviceTotal;
    private javax.swing.JLabel jLabel_CustomerName;
    private javax.swing.JLabel jLabel_InvoiceDate;
    private javax.swing.JLabel jLabel_InvoiceNumber;
    private javax.swing.JLabel jLabel_InvoiceNumberDisplay;
    private javax.swing.JLabel jLabel_InvoiceTotalDisplay;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_OfInvoiceTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_InvoiceItems;
    private javax.swing.JTable jTable_InvoiceTable;
    private javax.swing.JTextField jTextField_CustomerName;
    private javax.swing.JTextField jTextField_InvoiceDate;
    // End of variables declaration//GEN-END:variables

               // New Variables declaration
        private ArrayList<InvoiceHeader> invoices = new ArrayList<>();
        private HeaderTableModel headerTableModel ;
        private LineTableModel lineTableModel ;
        private InvoiceHeaderDialog headerDialog ;
        private InvoiceLineDialog lineDialog;
	//private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
        
        
           private SalesInvoiceListener listener = new SalesInvoiceListener(this);
           
    public SalesInvoiceListener getListener() {
        return listener;
    }

    public void setHeaderTableModel(HeaderTableModel headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public void setLineTableModel(LineTableModel lineTableModel) {
        this.lineTableModel = lineTableModel;
    }

    public void setHeaderDialog(InvoiceHeaderDialog headerDialog) {
        this.headerDialog = headerDialog;
    }

    public void setLineDialog(InvoiceLineDialog lineDialog) {
        this.lineDialog = lineDialog;
    }

    public JButton getAddItem() {
        return AddItem;
    }

    public JButton getCreateNewInvoice() {
        return CreateNewInvoice;
    }

    public JButton getDeleteInvoice() {
        return DeleteInvoice;
    }

    public JButton getDeleteItem() {
        return DeleteItem;
    }

    public JLabel getInvoiceItemsTable() {
        return InvoiceItemsTable;
    }

    public JLabel getInvoiceTable() {
        return InvoiceTable;
    }

    public JMenuItem getLoadFile() {
        return LoadFile;
    }

    public JMenuItem getSaveFile() {
        return SaveFile;
    }

    public JLabel getjLabelInviceTotal() {
        return jLabelInviceTotal;
    }

    public JLabel getjLabel_CustomerName() {
        return jLabel_CustomerName;
    }

    public JLabel getjLabel_InvoiceDate() {
        return jLabel_InvoiceDate;
    }

    public JLabel getjLabel_InvoiceNumber() {
        return jLabel_InvoiceNumber;
    }

    public JLabel getjLabel_InvoiceNumberDisplay() {
        return jLabel_InvoiceNumberDisplay;
    }

    public JLabel getjLabel_InvoiceTotalDisplay() {
        return jLabel_InvoiceTotalDisplay;
    }

    public JPanel getjPanel_OfInvoiceTable() {
        return jPanel_OfInvoiceTable;
    }

    public JTable getjTable_InvoiceItems() {
        return jTable_InvoiceItems;
    }

    public JTable getjTable_InvoiceTable() {
        return jTable_InvoiceTable;
    }

    public JTextField getjTextField_CustomerName() {
        return jTextField_CustomerName;
    }

    public JTextField getjTextField_InvoiceDate() {
        return jTextField_InvoiceDate;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

    public HeaderTableModel getHeaderTableModel() {
        return headerTableModel;
    }

    public LineTableModel getLineTableModel() {
        return lineTableModel;
    }

    public InvoiceHeaderDialog getHeaderDialog() {
        return headerDialog;
    }

    public InvoiceLineDialog getLineDialog() {
        return lineDialog;
    }

}


	   
