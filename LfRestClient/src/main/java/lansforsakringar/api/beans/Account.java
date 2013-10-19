package lansforsakringar.api.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	private String accountName;
	private String type;
	private String accountNumber;
    private Double balance;
    private String clearingNumber;
    private Double dispoibleAmount;
    private String ledger;
    private String productCode;
    private Boolean transferFrom;
    private Boolean transferTo;
    private Boolean youthAccount;
    private String bankName;
    private Boolean localAccount;
    private Boolean savedRecipient;
    
    public Account() {
		// ...
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getClearingNumber() {
		return clearingNumber;
	}

	public void setClearingNumber(String clearingNumber) {
		this.clearingNumber = clearingNumber;
	}

	public Double getDispoibleAmount() {
		return dispoibleAmount;
	}

	public void setDispoibleAmount(Double dispoibleAmount) {
		this.dispoibleAmount = dispoibleAmount;
	}

	public String getLedger() {
		return ledger;
	}

	public void setLedger(String ledger) {
		this.ledger = ledger;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Boolean getTransferFrom() {
		return transferFrom;
	}

	public void setTransferFrom(Boolean transferFrom) {
		this.transferFrom = transferFrom;
	}

	public Boolean getTransferTo() {
		return transferTo;
	}

	public void setTransferTo(Boolean transferTo) {
		this.transferTo = transferTo;
	}

	public Boolean getYouthAccount() {
		return youthAccount;
	}

	public void setYouthAccount(Boolean youthAccount) {
		this.youthAccount = youthAccount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Boolean getLocalAccount() {
		return localAccount;
	}

	public void setLocalAccount(Boolean localAccount) {
		this.localAccount = localAccount;
	}

	public Boolean getSavedRecipient() {
		return savedRecipient;
	}

	public void setSavedRecipient(Boolean savedRecipient) {
		this.savedRecipient = savedRecipient;
	}
    
    
}
