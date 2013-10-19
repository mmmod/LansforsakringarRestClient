package lansforsakringar.api.services.internal.transfer;

public class AuthenticateRequest {
	private String ssn;
	private String pin;
	
	public AuthenticateRequest() {
		// ...
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
