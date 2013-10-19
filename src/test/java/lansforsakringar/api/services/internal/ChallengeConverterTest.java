package lansforsakringar.api.services.internal;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ChallengeConverterTest {

	@Test
	public void test() throws Exception {
		assertThat(ChallengeConverter.calculateLfHash(new Integer(1458375292))).isEqualTo(
				"9ffab7ad2d01a0a550c7df295d96307cfddf9a34");
	}

}
