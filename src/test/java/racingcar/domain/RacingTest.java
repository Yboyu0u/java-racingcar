package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingTest {
	private Racing racing;

	@BeforeEach
	void setUp() {
		final String[] cars = new String[] {"잉", "매트", "소니"};
		final String count = "3";
		racing = new Racing(cars, count);

		for(int i = 0; i < 3; i++) {
			racing.race();
		}
	}

	@DisplayName("횟수에 맞게 경주가 이뤄지는지 확인")
	@Test
	void isEnd() {
		assertThat(racing.isEnd()).isTrue();
	}
}
