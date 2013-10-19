package lansforsakringar.api.beans;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
	private Double ammount;
	private String text;
	private Date transactiondate;

	public Transaction() {
		// ...
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Long transactiondate) {
		// It's not cool to have business logic here, not sure how to fix this differently.
		this.transactiondate = new Date(transactiondate);
	}
	
}
