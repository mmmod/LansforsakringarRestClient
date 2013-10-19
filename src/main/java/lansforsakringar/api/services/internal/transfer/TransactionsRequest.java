package lansforsakringar.api.services.internal.transfer;

public class TransactionsRequest {
	private Integer requestedPage;
	private String ledger;
	private String accountNumber;
	
	public TransactionsRequest() {
		// ...
	}

	public Integer getRequestedPage() {
		return requestedPage;
	}

	public void setRequestedPage(Integer requestedPage) {
		this.requestedPage = requestedPage;
	}

	public String getLedger() {
		return ledger;
	}

	public void setLedger(String ledger) {
		this.ledger = ledger;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
