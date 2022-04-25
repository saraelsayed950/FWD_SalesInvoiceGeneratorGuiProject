
package project1_salesinvoices.Model;


import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

	private int invoiceID ;
	private Date invoiceDate ;
	private String invoiceCustomerName;
	private ArrayList<InvoiceLine> Lines;
	private double invoiceTotal;
	
	public InvoiceHeader(int invoiceID, Date invoiceDate, String invoiceCustomerName) {
		super();
		this.invoiceID = invoiceID;
		this.invoiceDate = invoiceDate;
		this.invoiceCustomerName = invoiceCustomerName;
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceCustomerName() {
		return invoiceCustomerName;
	}

	public void setInvoiceCustomerName(String invoiceCustomerName) {
		this.invoiceCustomerName = invoiceCustomerName;
	}

	public ArrayList<InvoiceLine> getLines() {
		if (Lines == null ) {
			Lines = new ArrayList<>(); // lazy loading
		}
		return Lines;
	}

	public void setLines(ArrayList<InvoiceLine> lines) {
		Lines = lines;
	}

	public double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}	
        
	public void addLine (InvoiceLine line){
            getLines().add(line);
            setInvoiceTotal(getInvoiceTotal() + line.getItemTotal());
        }
}
