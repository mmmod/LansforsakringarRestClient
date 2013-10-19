package lansforsakringar.api.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsResponse {
	private Boolean hasMore;
	private Integer nextSequenceNumber;
	private List<Transaction> transactions;

	public TransactionsResponse() {
		// ...
	}

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public Integer getNextSequenceNumber() {
		return nextSequenceNumber;
	}

	public void setNextSequenceNumber(Integer nextSequenceNumber) {
		this.nextSequenceNumber = nextSequenceNumber;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
