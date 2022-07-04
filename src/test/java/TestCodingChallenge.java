import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCodingChallenge {

    MainCodingChallenge mainCodingChallenge = new MainCodingChallenge();

    @Test
    public void streamShouldReturnListOfNameWhenAgeLessThan40() {
        final List<String> names = mainCodingChallenge.useStream(MainCodingChallenge.users);
        assertThat(names).isNotNull();
    }

    @Test
    public void optionalShouldReturnNegativeInCaseStringIsNull() {
        final Integer res = mainCodingChallenge.useOptional(null);
        assertThat(res).isEqualTo(-1);
    }

    // TODO: Write a test for method 'useOptional' where the parameter is 'hello'

}
