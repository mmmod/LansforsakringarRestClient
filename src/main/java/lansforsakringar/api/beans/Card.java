package lansforsakringar.api.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
	private Double aviAmount;
	private Double balance;
	private Double cardAvailable;
	private Double cardLimit;
	private String cardName;
	private String cardNumber;
	private String cardType;
	private String connectedAccountNumber;
	private String expires;
	private Double reservedAmount;
	private String statusText;
	private String versionNumber;

	public Card() {
		// ...
	}

	public Double getAviAmount() {
		return aviAmount;
	}

	public void setAviAmount(Double aviAmount) {
		this.aviAmount = aviAmount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getCardAvailable() {
		return cardAvailable;
	}

	public void setCardAvailable(Double cardAvailable) {
		this.cardAvailable = cardAvailable;
	}

	public Double getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String ardNumber) {
		this.cardNumber = ardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getConnectedAccountNumber() {
		return connectedAccountNumber;
	}

	public void setConnectedAccountNumber(String connectedAccountNumber) {
		this.connectedAccountNumber = connectedAccountNumber;
	}

	public String getExpires() {
		return expires;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}

	public Double getReservedAmount() {
		return reservedAmount;
	}

	public void setReservedAmount(Double reservedAmount) {
		this.reservedAmount = reservedAmount;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

}
