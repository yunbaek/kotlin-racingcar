package racingcar.domain

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

class CarsGeneratorTest {

    @Test
    fun `입력받은 자동차 이름이 1개 이상이어야 한다`() {
        assertThatIllegalArgumentException()
            .isThrownBy { CarsGenerator { true }.generate("") }
    }

    @Test
    fun `자동차 이름은 중복되지 않아야 한다`() {
        assertThatIllegalArgumentException()
            .isThrownBy { CarsGenerator() { true }.generate("test, test") }
    }
}