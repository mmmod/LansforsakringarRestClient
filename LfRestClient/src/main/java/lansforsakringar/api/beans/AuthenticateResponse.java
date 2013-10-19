package lansforsakringar.api.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticateResponse {
	private String name;
	private String ssn;
	private String lfCompanyBelonging;
	private String ticket;
	private String ticketLifetime;
	private String pinPadAvailable;

	public AuthenticateResponse() {
		// ...
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLfCompanyBelonging() {
		return lfCompanyBelonging;
	}

	public void setLfCompanyBelonging(String lfCompanyBelonging) {
		this.lfCompanyBelonging = lfCompanyBelonging;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getTicketLifetime() {
		return ticketLifetime;
	}

	public void setTicketLifetime(String ticketLifetime) {
		this.ticketLifetime = ticketLifetime;
	}

	public String getPinPadAvailable() {
		return pinPadAvailable;
	}

	public void setPinPadAvailable(String pinPadAvailable) {
		this.pinPadAvailable = pinPadAvailable;
	}
}
