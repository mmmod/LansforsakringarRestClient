package lansforsakringar.api.services.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.DecoderException;

/**
 * Calculates and hashes the challenge-response code.
 * 
 * @see <a
 *      href="http://blog.sallarp.com/lansforsakringar-api.html">http://blog.sallarp.com/lansforsakringar-api.html</a>
 */
public class ChallengeConverter {
	private static final int MAGIC_NUMBER = 4112;

	public static String calculateLfHash(Integer number)
			throws NoSuchAlgorithmException, DecoderException {

		String hexString = Integer.toHexString(number + MAGIC_NUMBER);

		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] digest = md.digest(hexString.getBytes());
		return byteArrayToHexString(digest);
	}

	private static String byteArrayToHexString(byte[] b) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
		}
		return result;
	}

}
