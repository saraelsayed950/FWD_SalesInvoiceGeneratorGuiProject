
package project1_salesinvoices.Model;

public class InvoiceLine {
	private String itemName ;
	private double itemPrice ;
	private int itemCount ;
	private double ItemTotal ;
	private InvoiceHeader invoice;  
	
	public InvoiceLine() {}
	
  public InvoiceLine(String itemName, double itemPrice, int itemCount, InvoiceHeader invoice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
		this.invoice = invoice;
                this.setItemTotal(this.itemCount * this.itemPrice);
	}


public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getItemPrice() {
	return itemPrice;
}

public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}

public int getItemCount() {
	return itemCount;
}

public void setItemCount(int itemCount) {
	this.itemCount = itemCount;
}

public double getItemTotal() {
	return ItemTotal;
}

public void setItemTotal(double lineTotal) {
	this.ItemTotal = lineTotal;
}

public InvoiceHeader getInvoice() {
	return invoice;
}

public void setInvoice(InvoiceHeader invoice) {
	this.invoice = invoice;
}





}
