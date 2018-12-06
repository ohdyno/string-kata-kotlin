import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTests {
    @Test
    fun `adding empty string returns 0`() {
        assertEquals(0, Calculator().add(""))
    }
}

class Calculator {
    fun add(numbers: String): Int = 0
}
