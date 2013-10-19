package lansforsakringar.api.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HandshakeResponse {
	private Integer number;
	private String numberPair;
	
	public HandshakeResponse() {
		// ...
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNumberPair() {
		return numberPair;
	}

	public void setNumberPair(String numberPair) {
		this.numberPair = numberPair;
	}
	
	
}
