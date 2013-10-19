package lansforsakringar.api.services.internal;

public class Ticket {
	private String ctoken;
	private String utoken;
	
	public Ticket() {
		// ...
	}

	public Ticket(String ctoken, String utoken) {
		this.ctoken = ctoken;
		this.utoken = utoken;
	}
	
	public String getCtoken() {
		return ctoken;
	}

	public void setCtoken(String ctoken) {
		this.ctoken = ctoken;
	}

	public String getUtoken() {
		return utoken;
	}

	public void setUtoken(String utoken) {
		this.utoken = utoken;
	}
	
	

}
