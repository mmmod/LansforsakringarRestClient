package lansforsakringar.api.services.internal.transfer;

public class TokenChallengeRequest {

	private Integer originalChallenge;
	private String hash;
	private String challengePair;

	
	public TokenChallengeRequest() {
		// ...
	}


	public Integer getOriginalChallenge() {
		return originalChallenge;
	}


	public void setOriginalChallenge(Integer originalChallenge) {
		this.originalChallenge = originalChallenge;
	}


	public String getHash() {
		return hash;
	}


	public void setHash(String hash) {
		this.hash = hash;
	}


	public String getChallengePair() {
		return challengePair;
	}


	public void setChallengePair(String challengePair) {
		this.challengePair = challengePair;
	}

	
	
}
